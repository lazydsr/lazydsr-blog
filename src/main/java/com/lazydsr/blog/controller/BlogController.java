package com.lazydsr.blog.controller;

import com.lazydsr.blog.entiry.es.EsBlog;
import com.lazydsr.blog.repository.es.EsBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * BlogController
 * PROJECT_NAME: lazydsr-blog
 * PACKAGE_NAME: com.lazydsr.blog.controller
 * Created by Lazy on 2018/1/28 19:44
 * Version: 0.1
 * Info: @TODO:...
 */
@RestController
@RequestMapping(value = "blog")
public class BlogController {
    @Autowired
    private EsBlogRepository esBlogRepository;

    @GetMapping
    public List<EsBlog> get(String title, String summary, String content, int page, int size) {
        Page<EsBlog> esBlogPage = esBlogRepository.findDistinctByTitleContainingOrSummaryContainingOrContentContains(title, summary, content, new PageRequest(page, size));
        System.out.println(esBlogPage.getTotalPages());
        System.out.println(esBlogPage.getTotalElements());
        System.out.println(esBlogPage.getContent().size());
        return esBlogPage.getContent();
    }
}
