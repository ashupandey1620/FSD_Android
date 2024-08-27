package com.ashutosh.fsd.NetworkModule

import com.ashutosh.fsd.NetworkModule.Model.AddUpdate.AddUpdateRequest
import com.ashutosh.fsd.NetworkModule.Model.AddUpdate.AddUpdateResponse
import com.ashutosh.fsd.NetworkModule.Model.ChangePassword.ChangePasswordRequest
import com.ashutosh.fsd.NetworkModule.Model.ChangePassword.ChangePasswordResponse
import com.ashutosh.fsd.NetworkModule.Model.LogOut.LogoutRequest
import com.ashutosh.fsd.NetworkModule.Model.LogOut.LogoutResponse
import com.ashutosh.fsd.NetworkModule.Model.Login.LoginRequest
import com.ashutosh.fsd.NetworkModule.Model.Login.LoginResponse
import com.ashutosh.fsd.NetworkModule.Model.RefreshToken.RefreshTokenRequest
import com.ashutosh.fsd.NetworkModule.Model.RefreshToken.RefreshTokenResponse
import com.ashutosh.fsd.NetworkModule.Model.Register.RegisterRequest
import com.ashutosh.fsd.NetworkModule.Model.Register.RegisterResponse
import com.ashutosh.fsd.NetworkModule.Model.ViewUpdate.ViewUpdateRequest
import com.ashutosh.fsd.NetworkModule.Model.ViewUpdate.ViewUpdateResponse
import com.ashutosh.growappassignment.NetworkModule.Model.CompanyOverView.CompanyOverViewResponse
import com.ashutosh.growappassignment.NetworkModule.Model.TicketSearch.TicketSearchResponse
import com.ashutosh.growappassignment.NetworkModule.Model.TopGainAndLoss.TopGainAndLossResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface fsdApi {

    /**
     * All the POST API DECLARATION
     */

    @Headers("Content-Type: application/json")
    @POST("/api/login")
    suspend fun login(
        @Body login: LoginRequest
    ): Response<LoginResponse>

    @Headers("Content-Type: application/json")
    @POST("/api/register")
    suspend fun register(
        @Body register: RegisterRequest
    ):Response<RegisterResponse>

    @Headers("Content-Type: application/json")
    @POST("/api/add-update")
    suspend fun addUpdates(
        @Body updates: AddUpdateRequest
    ):Response<AddUpdateResponse>

//    @Headers("Content-Type: application/json")
//    @POST("/api/profile-image")
//    suspend fun updateProfileImage(
//        @Body updateImage: UpdateProfileRequest
//    ):Response<UpdateProfileResponse>

    @Headers("Content-Type: application/json")
    @POST("/api/view-updates")
    suspend fun viewUpdates(
        @Body viewUpdates: ViewUpdateRequest
    ):Response<ViewUpdateResponse>

    @Headers("Content-Type: application/json")
    @POST("/api/change-password")
    suspend fun changePassword(
        @Body password: ChangePasswordRequest
    ):Response<ChangePasswordResponse>

//    @Headers("Content-Type: application/json")
//    @POST("/api/get_file_url")
//    suspend fun getFileUrl(
//        @Body fileUrl: GetFileURLRequest
//    ):Response<GetFileURLResponse>

    @Headers("Content-Type: application/json")
    @POST("/api/logout")
    suspend fun logout(
        @Body logout: LogoutRequest
    ):Response<LogoutResponse>

    @Headers("Content-Type: application/json")
    @POST("/api/refresh")
    suspend fun refreshToken(
        @Body refreshToken: RefreshTokenRequest
    ):Response<RefreshTokenResponse>

//    @Headers("Content-Type: application/json")
//    @POST("/api/upload")
//    suspend fun uploadFile(
//        @Body file: UploadFileRequest
//    ):Response<UploadFileResponse>

//    @Headers("Content-Type: application/json")
//    @POST("/api/addFilesToFileCollection")
//    suspend fun addFileToCollection(
//        @Body file: AddFileToCollectionRequest
//    ):Response<AddFileToCollectionResponse>
//
//    @Headers("Content-Type: application/json")
//    @POST("/api/file-details")
//    suspend fun getSpecificFile(
//        @Body id: GetSpecificFileRequest
//    ):Response<GetSpecificFileResponse>

}