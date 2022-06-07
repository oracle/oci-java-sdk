/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ImportGlossaryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ImportGlossaryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ImportGlossaryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.ImportGlossaryDetails> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    public String getCatalogId() {
        return catalogId;
    }
    /**
     * Unique glossary key.
     */
    private String glossaryKey;

    public String getGlossaryKey() {
        return glossaryKey;
    }
    /**
     * The file contents to import the glossary.
     */
    private com.oracle.bmc.datacatalog.model.ImportGlossaryDetails importGlossaryDetails;

    public com.oracle.bmc.datacatalog.model.ImportGlossaryDetails getImportGlossaryDetails() {
        return importGlossaryDetails;
    }
    /**
     * Specify if the relationship metadata is imported for the glossary.
     */
    private Boolean isRelationshipImported;

    public Boolean getIsRelationshipImported() {
        return isRelationshipImported;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datacatalog.model.ImportGlossaryDetails getBody$() {
        return importGlossaryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ImportGlossaryRequest, com.oracle.bmc.datacatalog.model.ImportGlossaryDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String catalogId = null;

        /**
         * Unique catalog identifier.
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        private String glossaryKey = null;

        /**
         * Unique glossary key.
         * @return this builder instance
         */
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            return this;
        }

        private com.oracle.bmc.datacatalog.model.ImportGlossaryDetails importGlossaryDetails = null;

        /**
         * The file contents to import the glossary.
         * @return this builder instance
         */
        public Builder importGlossaryDetails(
                com.oracle.bmc.datacatalog.model.ImportGlossaryDetails importGlossaryDetails) {
            this.importGlossaryDetails = importGlossaryDetails;
            return this;
        }

        private Boolean isRelationshipImported = null;

        /**
         * Specify if the relationship metadata is imported for the glossary.
         * @return this builder instance
         */
        public Builder isRelationshipImported(Boolean isRelationshipImported) {
            this.isRelationshipImported = isRelationshipImported;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ImportGlossaryRequest o) {
            catalogId(o.getCatalogId());
            glossaryKey(o.getGlossaryKey());
            importGlossaryDetails(o.getImportGlossaryDetails());
            isRelationshipImported(o.getIsRelationshipImported());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ImportGlossaryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ImportGlossaryRequest
         */
        public ImportGlossaryRequest build() {
            ImportGlossaryRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacatalog.model.ImportGlossaryDetails body) {
            importGlossaryDetails(body);
            return this;
        }

        /**
         * Build the instance of ImportGlossaryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ImportGlossaryRequest
         */
        public ImportGlossaryRequest buildWithoutInvocationCallback() {
            ImportGlossaryRequest request = new ImportGlossaryRequest();
            request.catalogId = catalogId;
            request.glossaryKey = glossaryKey;
            request.importGlossaryDetails = importGlossaryDetails;
            request.isRelationshipImported = isRelationshipImported;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ImportGlossaryRequest(catalogId, glossaryKey, importGlossaryDetails, isRelationshipImported, opcRequestId, opcRetryToken);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .glossaryKey(glossaryKey)
                .importGlossaryDetails(importGlossaryDetails)
                .isRelationshipImported(isRelationshipImported)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(",importGlossaryDetails=").append(String.valueOf(this.importGlossaryDetails));
        sb.append(",isRelationshipImported=").append(String.valueOf(this.isRelationshipImported));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportGlossaryRequest)) {
            return false;
        }

        ImportGlossaryRequest other = (ImportGlossaryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.importGlossaryDetails, other.importGlossaryDetails)
                && java.util.Objects.equals(
                        this.isRelationshipImported, other.isRelationshipImported)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.importGlossaryDetails == null
                                ? 43
                                : this.importGlossaryDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isRelationshipImported == null
                                ? 43
                                : this.isRelationshipImported.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
