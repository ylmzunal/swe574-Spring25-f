package com.yusuf.eurekanexus.network

import com.yusuf.eurekanexus.data.model.PostDto
import com.yusuf.eurekanexus.data.model.CommentDto
import com.yusuf.eurekanexus.data.model.UserDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @POST("/api/users/signup")
    suspend fun signup(@Body userDto: UserDto): Response<String>

    @POST("/api/users/login")
    suspend fun login(@Body userDto: UserDto): Response<Map<String, String>>

    @GET("/api/posts")
    suspend fun getAllPosts(): Response<List<PostDto>>

    @GET("/api/posts/paginated")
    suspend fun getPaginatedPosts(
        @Query("page") page: Int,
        @Query("size") size: Int,
        @Query("sort") sort: String
    ): Response<List<PostDto>>

    @POST("/api/posts")
    suspend fun createPost(@Body postDto: PostDto): Response<PostDto>

    @POST("/api/comments")
    suspend fun createComment(@Body commentDto: CommentDto): Response<CommentDto>

    @GET("/api/posts/{id}")
    suspend fun getPostById(@Path("id") id: Long): Response<PostDto>

    @POST("/api/posts/{id}/upvote")
    suspend fun upvotePost(
        @Path("id") id: Long,
        @Body voteType: String = "upvote"
    ): Response<PostDto>

    @POST("/api/posts/{id}/downvote")
    suspend fun downvotePost(
        @Path("id") id: Long,
        @Body voteType: String = "downvote"
    ): Response<PostDto>

    @GET("/api/users/{id}")
    suspend fun getUserById(@Path("id") id: Long): Response<UserDto>
}