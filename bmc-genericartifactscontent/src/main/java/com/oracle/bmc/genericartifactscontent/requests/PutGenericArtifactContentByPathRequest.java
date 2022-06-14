/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.genericartifactscontent.requests;

import com.oracle.bmc.genericartifactscontent.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/genericartifactscontent/PutGenericArtifactContentByPathExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PutGenericArtifactContentByPathRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class PutGenericArtifactContentByPathRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the repository.
     * <p>
     * Example: {@code ocid1.repository.oc1..exampleuniqueID}
     *
     */
    private String repositoryId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the repository.
     * <p>
     * Example: {@code ocid1.repository.oc1..exampleuniqueID}
     *
     */
    public String getRepositoryId() {
        return repositoryId;
    }
    /**
     * A user-defined path to describe the location of an artifact. You can use slashes to organize the repository, but slashes do not create a directory structure. An artifact path does not include an artifact version.
     * <p>
     * Example: {@code project01/my-web-app/artifact-abc}
     *
     */
    private String artifactPath;

    /**
     * A user-defined path to describe the location of an artifact. You can use slashes to organize the repository, but slashes do not create a directory structure. An artifact path does not include an artifact version.
     * <p>
     * Example: {@code project01/my-web-app/artifact-abc}
     *
     */
    public String getArtifactPath() {
        return artifactPath;
    }
    /**
     * A user-defined string to describe the artifact version.
     * <p>
     * Example: {@code 1.1.2} or {@code 1.2-beta-2}
     *
     */
    private String version;

    /**
     * A user-defined string to describe the artifact version.
     * <p>
     * Example: {@code 1.1.2} or {@code 1.2-beta-2}
     *
     */
    public String getVersion() {
        return version;
    }
    /**
     * Uploads an artifact. Provide artifact path, version and content. Avoid entering confidential information when you define the path and version.
     */
    private java.io.InputStream genericArtifactContentBody;

    /**
     * Uploads an artifact. Provide artifact path, version and content. Avoid entering confidential information when you define the path and version.
     */
    public java.io.InputStream getGenericArtifactContentBody() {
        return genericArtifactContentBody;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.  The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value. When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.  The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value. When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned [request ID](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm)
     * <p>
     * Example: {@code bxxxxxxx-fxxx-4xxx-9xxx-bxxxxxxxxxxx}
     * If you contact Oracle about a request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned [request ID](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm)
     * <p>
     * Example: {@code bxxxxxxx-fxxx-4xxx-9xxx-bxxxxxxxxxxx}
     * If you contact Oracle about a request, provide this request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return genericArtifactContentBody;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutGenericArtifactContentByPathRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the repository.
         * <p>
         * Example: {@code ocid1.repository.oc1..exampleuniqueID}
         *
         */
        private String repositoryId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the repository.
         * <p>
         * Example: {@code ocid1.repository.oc1..exampleuniqueID}
         *
         * @param repositoryId the value to set
         * @return this builder instance
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * A user-defined path to describe the location of an artifact. You can use slashes to organize the repository, but slashes do not create a directory structure. An artifact path does not include an artifact version.
         * <p>
         * Example: {@code project01/my-web-app/artifact-abc}
         *
         */
        private String artifactPath = null;

        /**
         * A user-defined path to describe the location of an artifact. You can use slashes to organize the repository, but slashes do not create a directory structure. An artifact path does not include an artifact version.
         * <p>
         * Example: {@code project01/my-web-app/artifact-abc}
         *
         * @param artifactPath the value to set
         * @return this builder instance
         */
        public Builder artifactPath(String artifactPath) {
            this.artifactPath = artifactPath;
            return this;
        }

        /**
         * A user-defined string to describe the artifact version.
         * <p>
         * Example: {@code 1.1.2} or {@code 1.2-beta-2}
         *
         */
        private String version = null;

        /**
         * A user-defined string to describe the artifact version.
         * <p>
         * Example: {@code 1.1.2} or {@code 1.2-beta-2}
         *
         * @param version the value to set
         * @return this builder instance
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Uploads an artifact. Provide artifact path, version and content. Avoid entering confidential information when you define the path and version.
         */
        private java.io.InputStream genericArtifactContentBody = null;

        /**
         * Uploads an artifact. Provide artifact path, version and content. Avoid entering confidential information when you define the path and version.
         * @param genericArtifactContentBody the value to set
         * @return this builder instance
         */
        public Builder genericArtifactContentBody(java.io.InputStream genericArtifactContentBody) {
            this.genericArtifactContentBody = genericArtifactContentBody;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.  The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value. When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.  The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value. When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned [request ID](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm)
         * <p>
         * Example: {@code bxxxxxxx-fxxx-4xxx-9xxx-bxxxxxxxxxxx}
         * If you contact Oracle about a request, provide this request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned [request ID](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm)
         * <p>
         * Example: {@code bxxxxxxx-fxxx-4xxx-9xxx-bxxxxxxxxxxx}
         * If you contact Oracle about a request, provide this request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PutGenericArtifactContentByPathRequest o) {
            repositoryId(o.getRepositoryId());
            artifactPath(o.getArtifactPath());
            version(o.getVersion());
            genericArtifactContentBody(o.getGenericArtifactContentBody());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PutGenericArtifactContentByPathRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PutGenericArtifactContentByPathRequest
         */
        public PutGenericArtifactContentByPathRequest build() {
            PutGenericArtifactContentByPathRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.io.InputStream body) {
            genericArtifactContentBody(body);
            return this;
        }

        /**
         * Build the instance of PutGenericArtifactContentByPathRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PutGenericArtifactContentByPathRequest
         */
        public PutGenericArtifactContentByPathRequest buildWithoutInvocationCallback() {
            PutGenericArtifactContentByPathRequest request =
                    new PutGenericArtifactContentByPathRequest();
            request.repositoryId = repositoryId;
            request.artifactPath = artifactPath;
            request.version = version;
            request.genericArtifactContentBody = genericArtifactContentBody;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new PutGenericArtifactContentByPathRequest(repositoryId, artifactPath, version, genericArtifactContentBody, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .repositoryId(repositoryId)
                .artifactPath(artifactPath)
                .version(version)
                .genericArtifactContentBody(genericArtifactContentBody)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",artifactPath=").append(String.valueOf(this.artifactPath));
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(",genericArtifactContentBody=")
                .append(String.valueOf(this.genericArtifactContentBody));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutGenericArtifactContentByPathRequest)) {
            return false;
        }

        PutGenericArtifactContentByPathRequest other = (PutGenericArtifactContentByPathRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.artifactPath, other.artifactPath)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.genericArtifactContentBody, other.genericArtifactContentBody)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.artifactPath == null ? 43 : this.artifactPath.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.genericArtifactContentBody == null
                                ? 43
                                : this.genericArtifactContentBody.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
