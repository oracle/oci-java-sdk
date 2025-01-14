/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ListSkillsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * When you are paging through a list, if this header appears in the response, then there might
     * be additional items still to get. Include this value as the {@code page} query parameter for
     * the subsequent GET request.
     */
    private String opcNextPage;

    /**
     * When you are paging through a list, if this header appears in the response, then there might
     * be additional items still to get. Include this value as the {@code page} query parameter for
     * the subsequent GET request.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The total number of results that match the query. */
    private Integer opcTotalItems;

    /**
     * The total number of results that match the query.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /** The returned {@code SkillCollection} instance. */
    private com.oracle.bmc.oda.model.SkillCollection skillCollection;

    /**
     * The returned {@code SkillCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.oda.model.SkillCollection getSkillCollection() {
        return skillCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "opcTotalItems",
        "skillCollection"
    })
    private ListSkillsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            Integer opcTotalItems,
            com.oracle.bmc.oda.model.SkillCollection skillCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcTotalItems = opcTotalItems;
        this.skillCollection = skillCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListSkillsResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * When you are paging through a list, if this header appears in the response, then there
         * might be additional items still to get. Include this value as the {@code page} query
         * parameter for the subsequent GET request.
         */
        private String opcNextPage;

        /**
         * When you are paging through a list, if this header appears in the response, then there
         * might be additional items still to get. Include this value as the {@code page} query
         * parameter for the subsequent GET request.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The total number of results that match the query. */
        private Integer opcTotalItems;

        /**
         * The total number of results that match the query.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /** The returned {@code SkillCollection} instance. */
        private com.oracle.bmc.oda.model.SkillCollection skillCollection;

        /**
         * The returned {@code SkillCollection} instance.
         *
         * @param skillCollection the value to set
         * @return this builder
         */
        public Builder skillCollection(com.oracle.bmc.oda.model.SkillCollection skillCollection) {
            this.skillCollection = skillCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListSkillsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcTotalItems(o.getOpcTotalItems());
            skillCollection(o.getSkillCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListSkillsResponse build() {
            return new ListSkillsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    opcTotalItems,
                    skillCollection);
        }
    }

    /**
     * Return a new builder for this response object.
     *
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
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",skillCollection=").append(String.valueOf(skillCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSkillsResponse)) {
            return false;
        }

        ListSkillsResponse other = (ListSkillsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(this.skillCollection, other.skillCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result =
                (result * PRIME)
                        + (this.skillCollection == null ? 43 : this.skillCollection.hashCode());
        return result;
    }
}
