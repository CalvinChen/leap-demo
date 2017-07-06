/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package hello.var;

import leap.core.annotation.Bean;
import leap.core.variable.VariableWithContext;
import leap.lang.Dates;
import leap.lang.el.ElEvalContext;

import java.util.Date;

@Bean(name = "getYearByCreatedAt")
public class GetYearByCreatedAt implements VariableWithContext {

    @Override
    public Object getValue(ElEvalContext context) {

        Object obj = context.resolveVariable("createdAt");

        if (null == obj) {
            obj = context.resolveVariable("$0");
        }



        if(null != obj) {

            if(obj instanceof Date) {

                Date date = (Date) obj;

                String year = Dates.format(date, "yyyy");

                return year; // sharding table by year
            }
        }

        return "default";
    }
}