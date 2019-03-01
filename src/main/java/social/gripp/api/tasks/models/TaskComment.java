package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskComment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String author;
    private String comment;
    private String responseTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getResponseTo() {
        return responseTo;
    }

    public void setResponseTo(String responseTo) {
        this.responseTo = responseTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskComment that = (TaskComment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        return responseTo != null ? responseTo.equals(that.responseTo) : that.responseTo == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (responseTo != null ? responseTo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskComment{" +
                "id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", comment='" + comment + '\'' +
                ", responseTo='" + responseTo + '\'' +
                '}';
    }
}
