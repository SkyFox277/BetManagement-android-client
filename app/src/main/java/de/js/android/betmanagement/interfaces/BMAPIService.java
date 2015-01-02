package de.js.android.betmanagement.interfaces;

import java.util.List;

import de.js.android.betmanagement.model.Group;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;

public interface BMAPIService {

    @Headers({"Accept: application/json"
    })
    @GET("/group/{group}")
    Group group(
            @Path("group") String group

    );

    @Headers({"Accept: application/json"
    })
    @GET("/group")
    List<Group> groups(
    );

//    @GET("/users/{user}/repos")
//    List<Repo> listRepos(
//            @Path("repo") String repo
//    );
}
