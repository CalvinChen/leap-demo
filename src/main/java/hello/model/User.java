package hello.model;

import leap.lang.meta.annotation.Filterable;
import leap.orm.annotation.Column;
import leap.orm.annotation.Id;
import leap.orm.annotation.NonColumn;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

import java.sql.Timestamp;
import java.sql.Date;

@Table("user")
public class User extends Model {
    @Id
    private String id;
    @Column
    @Filterable
    private String name;
    @NonColumn
    private String nickName;
    @Column
    private Integer age;
    @Column
    private Date birthday;
    @Column
    private Timestamp birthday1;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Timestamp getBirthday1() {
        return birthday1;
    }

    public void setBirthday1(Timestamp birthday1) {
        this.birthday1 = birthday1;
    }
}
