package hello.model;

import leap.orm.annotation.Column;
import leap.orm.annotation.Id;
import leap.orm.annotation.ManyToOne;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

/**
 * Created by calvin on 2017/6/26.
 */
@Table
public class Dog extends Model {

    @Id private String id;

    @Column private String name;

    @Column private String owner_id;

    @ManyToOne(User.class) private User owner;

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

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
