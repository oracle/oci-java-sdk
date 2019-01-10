/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.ResteasyClientConfigurator;
import com.oracle.bmc.identity.IdentityAsyncClient;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.model.CreateUserDetails;
import com.oracle.bmc.identity.model.UpdateUserDetails;
import com.oracle.bmc.identity.requests.CreateUserRequest;
import com.oracle.bmc.identity.requests.DeleteUserRequest;
import com.oracle.bmc.identity.requests.GetUserRequest;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.requests.UpdateUserRequest;
import com.oracle.bmc.identity.responses.CreateUserResponse;
import com.oracle.bmc.identity.responses.GetUserResponse;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.identity.responses.UpdateUserResponse;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageAsync;
import com.oracle.bmc.objectstorage.ObjectStorageAsyncClient;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.BucketSummary;
import com.oracle.bmc.objectstorage.model.CreateBucketDetails;
import com.oracle.bmc.objectstorage.requests.CreateBucketRequest;
import com.oracle.bmc.objectstorage.requests.DeleteBucketRequest;
import com.oracle.bmc.objectstorage.requests.DeleteObjectRequest;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.requests.ListBucketsRequest;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.responses.CreateBucketResponse;
import com.oracle.bmc.objectstorage.responses.DeleteBucketResponse;
import com.oracle.bmc.objectstorage.responses.DeleteObjectResponse;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.responses.ListBucketsResponse;
import com.oracle.bmc.objectstorage.responses.PutObjectResponse;
import com.oracle.bmc.responses.AsyncHandler;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.client.ClientBuilder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;

/**
 * An example to demonstrate how to use resteasy client with JavaSDK.
 */
@Slf4j
public class ResteasyClientWithObjectStorageExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws Exception {

        final String compartmentId = args[0];

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // The following line is only necessary for this example because we the configuration in
        // resources/META-INF/services/javax.ws.rs.client.ClientBuilder. If you are using Resteasy by default, this line
        // is not necessary
        System.setProperty(
                ClientBuilder.JAXRS_DEFAULT_CLIENT_BUILDER_PROPERTY,
                "org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder");

        ObjectStorage objectStorageClient =
                ObjectStorageClient.builder()
                        .additionalClientConfigurator(new ResteasyClientConfigurator())
                        .build(provider);

        ObjectStorageAsyncClient objectStorageAsyncClient =
                ObjectStorageAsyncClient.builder()
                        .additionalClientConfigurator(new ResteasyClientConfigurator())
                        .build(provider);

        objectStorageClient.setRegion(Region.US_PHOENIX_1);
        objectStorageAsyncClient.setRegion(Region.US_PHOENIX_1);

        try {
            // region use sync api
            String namespace =
                    objectStorageClient
                            .getNamespace(GetNamespaceRequest.builder().build())
                            .getValue();
            System.out.println("Using namespace: " + namespace);

            final String bucketName = "ResteasyClientBucket";
            final String objectName = "ResteasyClientObject";

            CreateBucketRequest createBucketRequest =
                    CreateBucketRequest.builder()
                            .namespaceName(namespace)
                            .createBucketDetails(
                                    CreateBucketDetails.builder()
                                            .compartmentId(compartmentId)
                                            .name(bucketName)
                                            .build())
                            .build();

            CreateBucketResponse createBucketResponse =
                    objectStorageClient.createBucket(createBucketRequest);
            System.out.println("New bucket location: " + createBucketResponse.getLocation());

            final byte[] contents = "Hello World!".getBytes();
            InputStream stream = new ByteArrayInputStream(contents);

            PutObjectRequest putObjectRequest =
                    PutObjectRequest.builder()
                            .namespaceName(namespace)
                            .bucketName(bucketName)
                            .objectName(objectName)
                            .putObjectBody(stream)
                            .contentLength(Long.valueOf(contents.length))
                            .build();

            PutObjectResponse putObjectResponse = objectStorageClient.putObject(putObjectRequest);
            System.out.println("New object md5: " + putObjectResponse.getOpcContentMd5());

            GetObjectRequest getObjectRequest =
                    GetObjectRequest.builder()
                            .namespaceName(namespace)
                            .bucketName(bucketName)
                            .objectName(objectName)
                            .build();

            GetObjectResponse getObjectResponse = objectStorageClient.getObject(getObjectRequest);
            System.out.println("Object md5: " + getObjectResponse.getContentMd5());
            getObjectResponse.getInputStream().close();

            DeleteObjectRequest deleteObjectRequest =
                    DeleteObjectRequest.builder()
                            .namespaceName(namespace)
                            .bucketName(bucketName)
                            .objectName(objectName)
                            .build();

            objectStorageClient.deleteObject(deleteObjectRequest);

            DeleteBucketRequest deleteBucketRequest =
                    DeleteBucketRequest.builder()
                            .namespaceName(namespace)
                            .bucketName(bucketName)
                            .build();

            objectStorageClient.deleteBucket(deleteBucketRequest);
            // endregion

            // region using Future
            Future<GetNamespaceResponse> getNamespaceResponseFuture =
                    objectStorageAsyncClient.getNamespace(
                            GetNamespaceRequest.builder().build(), null);
            namespace = getNamespaceResponseFuture.get().getValue();
            System.out.println("Using namespace: " + namespace);

            Future<CreateBucketResponse> createBucketResponseFuture =
                    objectStorageAsyncClient.createBucket(createBucketRequest, null);

            System.out.println(
                    "New bucket location: " + createBucketResponseFuture.get().getLocation());

            stream.reset();
            Future<PutObjectResponse> putObjectResponseFuture =
                    objectStorageAsyncClient.putObject(putObjectRequest, null);
            System.out.println(
                    "New object md5: " + putObjectResponseFuture.get().getOpcContentMd5());

            Future<GetObjectResponse> getObjectResponseFuture =
                    objectStorageAsyncClient.getObject(getObjectRequest, null);
            System.out.println("Object md5: " + getObjectResponseFuture.get().getContentMd5());
            getObjectResponseFuture.get().getInputStream().close();

            Future<DeleteObjectResponse> deleteObjectResponseFuture =
                    objectStorageAsyncClient.deleteObject(deleteObjectRequest, null);
            deleteObjectResponseFuture.get();

            Future<DeleteBucketResponse> deleteBucketResponseFuture =
                    objectStorageAsyncClient.deleteBucket(deleteBucketRequest, null);
            deleteBucketResponseFuture.get();
            // endregion

            // region use callback
            ResponseHandler<GetNamespaceRequest, GetNamespaceResponse> getNamespaceHandler =
                    new ResponseHandler<>();
            objectStorageAsyncClient.getNamespace(
                    GetNamespaceRequest.builder().build(), getNamespaceHandler);
            getNamespaceHandler.waitForCompletion();

            ResponseHandler<CreateBucketRequest, CreateBucketResponse> createBucketHandler =
                    new ResponseHandler<>();
            objectStorageAsyncClient.createBucket(createBucketRequest, createBucketHandler);
            createBucketHandler.waitForCompletion();

            stream.reset();
            ResponseHandler<PutObjectRequest, PutObjectResponse> putObjectHandler =
                    new ResponseHandler<>();
            objectStorageAsyncClient.putObject(putObjectRequest, putObjectHandler);
            putObjectHandler.waitForCompletion();

            ResponseHandler<GetObjectRequest, GetObjectResponse> getObjectHandler =
                    new ResponseHandler<>();
            objectStorageAsyncClient.getObject(getObjectRequest, getObjectHandler);
            getObjectHandler.waitForCompletion();

            ResponseHandler<DeleteObjectRequest, DeleteObjectResponse> deleteObjectHandler =
                    new ResponseHandler<>();
            objectStorageAsyncClient.deleteObject(deleteObjectRequest, deleteObjectHandler);
            deleteObjectHandler.waitForCompletion();

            ResponseHandler<DeleteBucketRequest, DeleteBucketResponse> deleteBucketHandler =
                    new ResponseHandler<>();
            objectStorageAsyncClient.deleteBucket(deleteBucketRequest, deleteBucketHandler);
            deleteBucketHandler.waitForCompletion();
            // endregion
        } finally {
            objectStorageClient.close();
            objectStorageAsyncClient.close();
            System.clearProperty(ClientBuilder.JAXRS_DEFAULT_CLIENT_BUILDER_PROPERTY);
        }
    }

    static class ResponseHandler<IN, OUT> implements AsyncHandler<IN, OUT> {
        private Throwable failed = null;
        private CountDownLatch latch = new CountDownLatch(1);

        private void waitForCompletion() throws Exception {
            latch.await();
            if (failed != null) {
                if (failed instanceof Exception) {
                    throw (Exception) failed;
                }
                throw (Error) failed;
            }
        }

        @Override
        public void onSuccess(IN request, OUT response) {
            if (response instanceof GetNamespaceResponse) {
                System.out.println(
                        "Using namespace: " + ((GetNamespaceResponse) response).getValue());
            } else if (response instanceof CreateBucketResponse) {
                System.out.println(
                        "New bucket location: " + ((CreateBucketResponse) response).getLocation());
            } else if (response instanceof PutObjectResponse) {
                System.out.println(
                        "New object md5: " + ((PutObjectResponse) response).getOpcContentMd5());
            } else if (response instanceof GetObjectResponse) {
                System.out.println("Object md5: " + ((GetObjectResponse) response).getContentMd5());
            }
            latch.countDown();
        }

        @Override
        public void onError(IN request, Throwable error) {
            failed = error;
            latch.countDown();
        }
    }
}
