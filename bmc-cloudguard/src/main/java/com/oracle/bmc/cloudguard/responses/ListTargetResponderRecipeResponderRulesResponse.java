/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.responses;

import com.oracle.bmc.cloudguard.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class ListTargetResponderRecipeResponderRulesResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned TargetResponderRecipeResponderRuleCollection instance.
     */
    private com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleCollection
            targetResponderRecipeResponderRuleCollection;

    /**
     * The returned TargetResponderRecipeResponderRuleCollection instance.
     * @return the value
     */
    public com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleCollection
            getTargetResponderRecipeResponderRuleCollection() {
        return targetResponderRecipeResponderRuleCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "targetResponderRecipeResponderRuleCollection"
    })
    private ListTargetResponderRecipeResponderRulesResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleCollection
                    targetResponderRecipeResponderRuleCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.targetResponderRecipeResponderRuleCollection =
                targetResponderRecipeResponderRuleCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned TargetResponderRecipeResponderRuleCollection instance.
         */
        private com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleCollection
                targetResponderRecipeResponderRuleCollection;

        /**
         * The returned TargetResponderRecipeResponderRuleCollection instance.
         * @param targetResponderRecipeResponderRuleCollection the value to set
         * @return this builder
         */
        public Builder targetResponderRecipeResponderRuleCollection(
                com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleCollection
                        targetResponderRecipeResponderRuleCollection) {
            this.targetResponderRecipeResponderRuleCollection =
                    targetResponderRecipeResponderRuleCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListTargetResponderRecipeResponderRulesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            targetResponderRecipeResponderRuleCollection(
                    o.getTargetResponderRecipeResponderRuleCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListTargetResponderRecipeResponderRulesResponse build() {
            return new ListTargetResponderRecipeResponderRulesResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    targetResponderRecipeResponderRuleCollection);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",targetResponderRecipeResponderRuleCollection=")
                .append(String.valueOf(targetResponderRecipeResponderRuleCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTargetResponderRecipeResponderRulesResponse)) {
            return false;
        }

        ListTargetResponderRecipeResponderRulesResponse other =
                (ListTargetResponderRecipeResponderRulesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.targetResponderRecipeResponderRuleCollection,
                        other.targetResponderRecipeResponderRuleCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResponderRecipeResponderRuleCollection == null
                                ? 43
                                : this.targetResponderRecipeResponderRuleCollection.hashCode());
        return result;
    }
}
