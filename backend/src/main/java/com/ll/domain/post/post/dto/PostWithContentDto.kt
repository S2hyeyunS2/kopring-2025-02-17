package com.ll.domain.post.post.dto;

import com.ll.domain.post.post.entity.Post


class PostWithContentDto(
    val content:String,
    val actorCanModify:Boolean?=null,
    val actorCanDelete:Boolean?=null,
    private val post: Post):PostDto(post) {
    constructor(post: Post) : this(
        content = post.content,
        post = post,
    )
}