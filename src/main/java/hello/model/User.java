package hello.model;

import leap.orm.annotation.Column;
import leap.orm.annotation.Id;
import leap.orm.annotation.NonColumn;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

@Table("user")
public class User extends Model {
    @Id
    private String id;
    @Column
    private String name;
    @NonColumn
    private String nickName;
    @Column
    private String longNum;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLongNum() {
        return longNum;
    }

    public void setLongNum(String longNum) {
        this.longNum = longNum;
    }
}
