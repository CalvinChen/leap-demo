package hello.model;

import leap.orm.annotation.Column;
import leap.orm.annotation.Id;
import leap.orm.annotation.NonColumn;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

import java.sql.Time;
import java.time.LocalTime;

@Table("user")
public class User extends Model {
    @Id
    private String id;
    @Column
    private String name;
    @NonColumn
    private String nickName;
    @Column
    private Time birthTimeStart;
    @Column
    private LocalTime birthTimeEnd;


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

    public Time getBirthTimeStart() {
        return birthTimeStart;
    }

    public void setBirthTimeStart(Time birthTimeStart) {
        this.birthTimeStart = birthTimeStart;
    }

    public LocalTime getBirthTimeEnd() {
        return birthTimeEnd;
    }

    public void setBirthTimeEnd(LocalTime birthTimeEnd) {
        this.birthTimeEnd = birthTimeEnd;
    }
}
