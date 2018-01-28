package com.lazydsr.blog.repository.es;

import com.lazydsr.blog.entiry.es.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * EsBlogRepository
 * PROJECT_NAME: lazydsr-blog
 * PACKAGE_NAME: com.lazydsr.blog.repository.es
 * Created by Lazy on 2018/1/28 18:08
 * Version: 0.1
 * Info: @TODO:...
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String> {
    Page<EsBlog> findDistinctByTitleContainingOrSummaryContainingOrContentContains(String title, String summary, String content, Pageable pageable);
}
