/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddImageShapeCompatibilityEntryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use AddImageShapeCompatibilityEntryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class AddImageShapeCompatibilityEntryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.AddImageShapeCompatibilityEntryDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
     */
    private String imageId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
     */
    public String getImageId() {
        return imageId;
    }
    /**
     * Shape name.
     */
    private String shapeName;

    /**
     * Shape name.
     */
    public String getShapeName() {
        return shapeName;
    }
    /**
     * Image shape compatibility details
     */
    private com.oracle.bmc.core.model.AddImageShapeCompatibilityEntryDetails
            addImageShapeCompatibilityEntryDetails;

    /**
     * Image shape compatibility details
     */
    public com.oracle.bmc.core.model.AddImageShapeCompatibilityEntryDetails
            getAddImageShapeCompatibilityEntryDetails() {
        return addImageShapeCompatibilityEntryDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.AddImageShapeCompatibilityEntryDetails getBody$() {
        return addImageShapeCompatibilityEntryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AddImageShapeCompatibilityEntryRequest,
                    com.oracle.bmc.core.model.AddImageShapeCompatibilityEntryDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
         */
        private String imageId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
         * @param imageId the value to set
         * @return this builder instance
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * Shape name.
         */
        private String shapeName = null;

        /**
         * Shape name.
         * @param shapeName the value to set
         * @return this builder instance
         */
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            return this;
        }

        /**
         * Image shape compatibility details
         */
        private com.oracle.bmc.core.model.AddImageShapeCompatibilityEntryDetails
                addImageShapeCompatibilityEntryDetails = null;

        /**
         * Image shape compatibility details
         * @param addImageShapeCompatibilityEntryDetails the value to set
         * @return this builder instance
         */
        public Builder addImageShapeCompatibilityEntryDetails(
                com.oracle.bmc.core.model.AddImageShapeCompatibilityEntryDetails
                        addImageShapeCompatibilityEntryDetails) {
            this.addImageShapeCompatibilityEntryDetails = addImageShapeCompatibilityEntryDetails;
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
        public Builder copy(AddImageShapeCompatibilityEntryRequest o) {
            imageId(o.getImageId());
            shapeName(o.getShapeName());
            addImageShapeCompatibilityEntryDetails(o.getAddImageShapeCompatibilityEntryDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AddImageShapeCompatibilityEntryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of AddImageShapeCompatibilityEntryRequest
         */
        public AddImageShapeCompatibilityEntryRequest build() {
            AddImageShapeCompatibilityEntryRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.core.model.AddImageShapeCompatibilityEntryDetails body) {
            addImageShapeCompatibilityEntryDetails(body);
            return this;
        }

        /**
         * Build the instance of AddImageShapeCompatibilityEntryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AddImageShapeCompatibilityEntryRequest
         */
        public AddImageShapeCompatibilityEntryRequest buildWithoutInvocationCallback() {
            AddImageShapeCompatibilityEntryRequest request =
                    new AddImageShapeCompatibilityEntryRequest();
            request.imageId = imageId;
            request.shapeName = shapeName;
            request.addImageShapeCompatibilityEntryDetails = addImageShapeCompatibilityEntryDetails;
            return request;
            // new AddImageShapeCompatibilityEntryRequest(imageId, shapeName, addImageShapeCompatibilityEntryDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .imageId(imageId)
                .shapeName(shapeName)
                .addImageShapeCompatibilityEntryDetails(addImageShapeCompatibilityEntryDetails);
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
        sb.append(",imageId=").append(String.valueOf(this.imageId));
        sb.append(",shapeName=").append(String.valueOf(this.shapeName));
        sb.append(",addImageShapeCompatibilityEntryDetails=")
                .append(String.valueOf(this.addImageShapeCompatibilityEntryDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddImageShapeCompatibilityEntryRequest)) {
            return false;
        }

        AddImageShapeCompatibilityEntryRequest other = (AddImageShapeCompatibilityEntryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(
                        this.addImageShapeCompatibilityEntryDetails,
                        other.addImageShapeCompatibilityEntryDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.addImageShapeCompatibilityEntryDetails == null
                                ? 43
                                : this.addImageShapeCompatibilityEntryDetails.hashCode());
        return result;
    }
}
