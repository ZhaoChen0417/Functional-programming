package functional_programming;

import java.util.List;
import java.util.Objects;

public class Author implements Comparable<Author> {

    public Author() {
    }

    public Author(Long id, String name, Integer age, String intro, List<Book> books) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.intro = intro;
        this.books = books;
    }

    //id
    private Long id;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //简介
    private String intro;
    //作品
    private List<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Author author = (Author) object;
        return Objects.equals(id, author.id) && Objects.equals(name, author.name) && Objects.equals(age, author.age) && Objects.equals(intro, author.intro) && Objects.equals(books, author.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, intro, books);
    }


    @Override
    public int compareTo(Author o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "functional_programming.Author{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", age=" + age +
          ", intro='" + intro + '\'' +
          ", books=" + books +
          '}';
    }
}
