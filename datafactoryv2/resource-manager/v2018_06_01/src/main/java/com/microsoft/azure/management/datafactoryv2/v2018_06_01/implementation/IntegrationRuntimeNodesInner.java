/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.UpdateIntegrationRuntimeNodeRequest;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in IntegrationRuntimeNodes.
 */
public class IntegrationRuntimeNodesInner {
    /** The Retrofit service to perform REST calls. */
    private IntegrationRuntimeNodesService service;
    /** The service client containing this operation class. */
    private DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimeNodesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntegrationRuntimeNodesInner(Retrofit retrofit, DataFactoryManagementClientImpl client) {
        this.service = retrofit.create(IntegrationRuntimeNodesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for IntegrationRuntimeNodes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntegrationRuntimeNodesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactoryv2.v2018_06_01.IntegrationRuntimeNodes get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/integrationRuntimes/{integrationRuntimeName}/nodes/{nodeName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("integrationRuntimeName") String integrationRuntimeName, @Path("nodeName") String nodeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactoryv2.v2018_06_01.IntegrationRuntimeNodes delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/integrationRuntimes/{integrationRuntimeName}/nodes/{nodeName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("integrationRuntimeName") String integrationRuntimeName, @Path("nodeName") String nodeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactoryv2.v2018_06_01.IntegrationRuntimeNodes update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/integrationRuntimes/{integrationRuntimeName}/nodes/{nodeName}")
        Observable<Response<ResponseBody>> update(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("integrationRuntimeName") String integrationRuntimeName, @Path("nodeName") String nodeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactoryv2.v2018_06_01.IntegrationRuntimeNodes getIpAddress" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/integrationRuntimes/{integrationRuntimeName}/nodes/{nodeName}/ipAddress")
        Observable<Response<ResponseBody>> getIpAddress(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("integrationRuntimeName") String integrationRuntimeName, @Path("nodeName") String nodeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SelfHostedIntegrationRuntimeNodeInner object if successful.
     */
    public SelfHostedIntegrationRuntimeNodeInner get(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        return getWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName).toBlocking().single().body();
    }

    /**
     * Gets a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SelfHostedIntegrationRuntimeNodeInner> getAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, final ServiceCallback<SelfHostedIntegrationRuntimeNodeInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName), serviceCallback);
    }

    /**
     * Gets a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<SelfHostedIntegrationRuntimeNodeInner> getAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        return getWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName).map(new Func1<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>, SelfHostedIntegrationRuntimeNodeInner>() {
            @Override
            public SelfHostedIntegrationRuntimeNodeInner call(ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> getWithServiceResponseAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, factoryName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>>>() {
                @Override
                public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SelfHostedIntegrationRuntimeNodeInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SelfHostedIntegrationRuntimeNodeInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        deleteWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName).toBlocking().single().body();
    }

    /**
     * Deletes a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName), serviceCallback);
    }

    /**
     * Deletes a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        return deleteWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, factoryName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SelfHostedIntegrationRuntimeNodeInner object if successful.
     */
    public SelfHostedIntegrationRuntimeNodeInner update(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        return updateWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName).toBlocking().single().body();
    }

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SelfHostedIntegrationRuntimeNodeInner> updateAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, final ServiceCallback<SelfHostedIntegrationRuntimeNodeInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName), serviceCallback);
    }

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<SelfHostedIntegrationRuntimeNodeInner> updateAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        return updateWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName).map(new Func1<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>, SelfHostedIntegrationRuntimeNodeInner>() {
            @Override
            public SelfHostedIntegrationRuntimeNodeInner call(ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> updateWithServiceResponseAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Integer concurrentJobsLimit = null;
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest = new UpdateIntegrationRuntimeNodeRequest();
        updateIntegrationRuntimeNodeRequest.withConcurrentJobsLimit(null);
        return service.update(this.client.subscriptionId(), resourceGroupName, factoryName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), updateIntegrationRuntimeNodeRequest, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>>>() {
                @Override
                public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param concurrentJobsLimit The number of concurrent jobs permitted to run on the integration runtime node. Values between 1 and maxConcurrentJobs(inclusive) are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SelfHostedIntegrationRuntimeNodeInner object if successful.
     */
    public SelfHostedIntegrationRuntimeNodeInner update(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, Integer concurrentJobsLimit) {
        return updateWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName, concurrentJobsLimit).toBlocking().single().body();
    }

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param concurrentJobsLimit The number of concurrent jobs permitted to run on the integration runtime node. Values between 1 and maxConcurrentJobs(inclusive) are allowed.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SelfHostedIntegrationRuntimeNodeInner> updateAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, Integer concurrentJobsLimit, final ServiceCallback<SelfHostedIntegrationRuntimeNodeInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName, concurrentJobsLimit), serviceCallback);
    }

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param concurrentJobsLimit The number of concurrent jobs permitted to run on the integration runtime node. Values between 1 and maxConcurrentJobs(inclusive) are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<SelfHostedIntegrationRuntimeNodeInner> updateAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, Integer concurrentJobsLimit) {
        return updateWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName, concurrentJobsLimit).map(new Func1<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>, SelfHostedIntegrationRuntimeNodeInner>() {
            @Override
            public SelfHostedIntegrationRuntimeNodeInner call(ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param concurrentJobsLimit The number of concurrent jobs permitted to run on the integration runtime node. Values between 1 and maxConcurrentJobs(inclusive) are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> updateWithServiceResponseAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, Integer concurrentJobsLimit) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest = new UpdateIntegrationRuntimeNodeRequest();
        updateIntegrationRuntimeNodeRequest.withConcurrentJobsLimit(concurrentJobsLimit);
        return service.update(this.client.subscriptionId(), resourceGroupName, factoryName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), updateIntegrationRuntimeNodeRequest, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>>>() {
                @Override
                public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SelfHostedIntegrationRuntimeNodeInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SelfHostedIntegrationRuntimeNodeInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the IP address of self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IntegrationRuntimeNodeIpAddressInner object if successful.
     */
    public IntegrationRuntimeNodeIpAddressInner getIpAddress(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        return getIpAddressWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName).toBlocking().single().body();
    }

    /**
     * Get the IP address of self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<IntegrationRuntimeNodeIpAddressInner> getIpAddressAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, final ServiceCallback<IntegrationRuntimeNodeIpAddressInner> serviceCallback) {
        return ServiceFuture.fromResponse(getIpAddressWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName), serviceCallback);
    }

    /**
     * Get the IP address of self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IntegrationRuntimeNodeIpAddressInner object
     */
    public Observable<IntegrationRuntimeNodeIpAddressInner> getIpAddressAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        return getIpAddressWithServiceResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, nodeName).map(new Func1<ServiceResponse<IntegrationRuntimeNodeIpAddressInner>, IntegrationRuntimeNodeIpAddressInner>() {
            @Override
            public IntegrationRuntimeNodeIpAddressInner call(ServiceResponse<IntegrationRuntimeNodeIpAddressInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the IP address of self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IntegrationRuntimeNodeIpAddressInner object
     */
    public Observable<ServiceResponse<IntegrationRuntimeNodeIpAddressInner>> getIpAddressWithServiceResponseAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getIpAddress(this.client.subscriptionId(), resourceGroupName, factoryName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<IntegrationRuntimeNodeIpAddressInner>>>() {
                @Override
                public Observable<ServiceResponse<IntegrationRuntimeNodeIpAddressInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<IntegrationRuntimeNodeIpAddressInner> clientResponse = getIpAddressDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<IntegrationRuntimeNodeIpAddressInner> getIpAddressDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<IntegrationRuntimeNodeIpAddressInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<IntegrationRuntimeNodeIpAddressInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
