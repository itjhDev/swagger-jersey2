/**
 *  Copyright 2015 Reverb Technologies, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package cn.luchat.usertoken.server;

import com.wordnik.swagger.annotations.*;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/user")
@Api(value="/user", description = "Operations about user")
@Produces({"application/json", "application/xml"})
public class UserResource {


  @POST
  @ApiOperation(value = "Create user",
    notes = "This can only be done by the logged in user.",
    position = 1)
  public Response createUser() {

    return Response.ok().entity("").build();
  }




  @POST
  @Path("/createWithList")
  @ApiOperation(value = "Creates list of users with given input array",
    position = 3)
  public Response createUsersWithListInput() {

      return Response.ok().entity("").build();
  }

  @PUT
  @Path("/{username}")
  @ApiOperation(value = "Updated user",
    notes = "This can only be done by the logged in user.",
    position = 4)
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Invalid user supplied"),
      @ApiResponse(code = 404, message = "User not found") })
  public Response updateUser(
      @ApiParam(value = "name that need to be deleted", required = true) @PathParam("username") String username) {

    return Response.ok().entity("").build();
  }

  @DELETE
  @Path("/{username}")
  @ApiOperation(value = "Delete user",
    notes = "This can only be done by the logged in user.",
    position = 5)
  @ApiResponses(value = {
      @ApiResponse(code = 400, message = "Invalid username supplied"),
      @ApiResponse(code = 404, message = "User not found") })
  public Response deleteUser(
      @ApiParam(value = "The name that needs to be deleted", required = true) @PathParam("username") String username) {

    return Response.ok().entity("").build();
  }



}
