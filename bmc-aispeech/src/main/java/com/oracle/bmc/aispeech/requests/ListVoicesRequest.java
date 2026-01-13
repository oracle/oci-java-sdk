/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.requests;

import com.oracle.bmc.aispeech.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/aispeech/ListVoicesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListVoicesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
public class ListVoicesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The model name to filter voices for given model name. */
    private com.oracle.bmc.aispeech.model.TtsOracleModelDetails.ModelName modelName;

    /** The model name to filter voices for given model name. */
    public com.oracle.bmc.aispeech.model.TtsOracleModelDetails.ModelName getModelName() {
        return modelName;
    }
    /** The Code or Id of the language to filter voices for given language code. */
    private String languageCode;

    /** The Code or Id of the language to filter voices for given language code. */
    public String getLanguageCode() {
        return languageCode;
    }
    /** The name of the speaker voice in which the user wants tts inference to be. */
    private String displayName;

    /** The name of the speaker voice in which the user wants tts inference to be. */
    public String getDisplayName() {
        return displayName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListVoicesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The model name to filter voices for given model name. */
        private com.oracle.bmc.aispeech.model.TtsOracleModelDetails.ModelName modelName = null;

        /**
         * The model name to filter voices for given model name.
         *
         * @param modelName the value to set
         * @return this builder instance
         */
        public Builder modelName(
                com.oracle.bmc.aispeech.model.TtsOracleModelDetails.ModelName modelName) {
            this.modelName = modelName;
            return this;
        }

        /** The Code or Id of the language to filter voices for given language code. */
        private String languageCode = null;

        /**
         * The Code or Id of the language to filter voices for given language code.
         *
         * @param languageCode the value to set
         * @return this builder instance
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        /** The name of the speaker voice in which the user wants tts inference to be. */
        private String displayName = null;

        /**
         * The name of the speaker voice in which the user wants tts inference to be.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(ListVoicesRequest o) {
            compartmentId(o.getCompartmentId());
            modelName(o.getModelName());
            languageCode(o.getLanguageCode());
            displayName(o.getDisplayName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListVoicesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListVoicesRequest
         */
        public ListVoicesRequest build() {
            ListVoicesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListVoicesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListVoicesRequest
         */
        public ListVoicesRequest buildWithoutInvocationCallback() {
            ListVoicesRequest request = new ListVoicesRequest();
            request.compartmentId = compartmentId;
            request.modelName = modelName;
            request.languageCode = languageCode;
            request.displayName = displayName;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListVoicesRequest(compartmentId, modelName, languageCode, displayName,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .modelName(modelName)
                .languageCode(languageCode)
                .displayName(displayName)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",modelName=").append(String.valueOf(this.modelName));
        sb.append(",languageCode=").append(String.valueOf(this.languageCode));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListVoicesRequest)) {
            return false;
        }

        ListVoicesRequest other = (ListVoicesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.modelName, other.modelName)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
