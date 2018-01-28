package com.lazydsr.blog.entiry.es;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * EsBlog
 * PROJECT_NAME: lazydsr-blog
 * PACKAGE_NAME: com.lazydsr.blog.entiry.es
 * Created by Lazy on 2018/1/28 18:02
 * Version: 0.1
 * Info: @TODO:...
 */
@Data
@Document(indexName = "blog", type = "blog")
public class EsBlog implements Serializable {

    @Id
    private String id;
    private String title;
    private String summary;
    private String content;

    public EsBlog() {
    }

    public EsBlog(String title, String summary, String content) {
        this.title = title;
        this.summary = summary;
        this.content = content;
    }

    public EsBlog(String id, String title, String summary, String content) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.content = content;
    }
}
