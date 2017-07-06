package hello.model.sharding;

import leap.lang.meta.annotation.Filterable;
import leap.orm.annotation.Column;
import leap.orm.annotation.Id;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

import java.util.Date;

/**
 * Created by calvin on 2017/7/4.
 */
@Table(dynamicTableName = "customer_order_${env.getYearByCreatedAt}")
public class CustomerOrder extends Model {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    @Filterable
    private Date createdAt;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
