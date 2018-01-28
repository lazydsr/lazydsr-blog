package com.lazydsr.blog;

import com.lazydsr.blog.entiry.es.EsBlog;
import com.lazydsr.blog.repository.es.EsBlogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LazydsrBlogApplicationTests {

    @Autowired
    EsBlogRepository esBlogRepository;

    @Test
    public void contextLoads() {
        esBlogRepository.deleteAll();
        esBlogRepository.save(new EsBlog("title","summary","content"));
        Page<EsBlog> esBlogPage = esBlogRepository.findDistinctByTitleContainingOrSummaryContainingOrContentContains("title", "", "", new PageRequest(0, 10));
        System.out.println(esBlogPage.getContent().get(0));
    }

}
