package hello.model.rel;

import leap.lang.meta.annotation.Filterable;
import leap.orm.annotation.Column;
import leap.orm.annotation.Id;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

/**
 * Created by calvin on 2017/6/28.
 */
@Table
public class Teacher extends Model {
    @Id
    private String id;

    @Column
    @Filterable
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
