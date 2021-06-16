package org.za.blog.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SaveArticleParam {
    private String articleID;
    private String articleTitle;
    private String articlePreview;
    private String context;
}
