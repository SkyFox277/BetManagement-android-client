package de.js.android.betmanagement.interfaces;

import java.util.List;

import de.js.android.betmanagement.model.Contributor;
import retrofit.http.GET;
import retrofit.http.Path;

public interface GithubApiService {
    @GET("/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(
            @Path("owner") String owner,
            @Path("repo") String repo
    );

//    @GET("/users/{user}/repos")
//    List<Repo> listRepos(
//            @Path("repo") String repo
//    );
}
