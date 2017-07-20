package hello.model;

import leap.lang.meta.annotation.Creatable;
import leap.lang.meta.annotation.Filterable;
import leap.lang.meta.annotation.Sortable;
import leap.orm.annotation.Column;
import leap.orm.annotation.Id;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

import java.util.Map;

@Table("user")
public class User extends Model {
    @Id
    @Creatable
    private String id;

    @Column
    @Filterable
    @Sortable
    private String name;

    @Column
    private String json;

    @Column
    private Dog jsonDog;

    @Column
    private Map<String, Object> jsonMap;

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

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public Dog getJsonDog() {
        return jsonDog;
    }

    public void setJsonDog(Dog jsonDog) {
        this.jsonDog = jsonDog;
    }

    public Map<String, Object> getJsonMap() {
        return jsonMap;
    }

    public void setJsonMap(Map<String, Object> jsonMap) {
        this.jsonMap = jsonMap;
    }
}
