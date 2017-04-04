package project.tools;

import project.model.Blog;

import java.util.Comparator;

/**
 * Created by Miracle on 2017/4/3.
 */

public class ComparatorBlog implements Comparator{
    public int compare(Object o1,Object o2){
        Blog b1 = (Blog)o1;
        Blog b2 = (Blog)o2;
        return b2.getBlogtime().compareTo(b1.getBlogtime());

    }
}
