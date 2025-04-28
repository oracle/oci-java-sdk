/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetVcnOverlapResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
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
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** For list pagination. A pagination token to get the total number of results available. */
    private Integer opcTotalItems;

    /**
     * For list pagination. A pagination token to get the total number of results available.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the work
     * request. Use
     * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/latest/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the request.
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the work
     * request. Use
     * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/latest/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** The IpInventory API current state. */
    private LifecycleState lifecycleState;

    /**
     * The IpInventory API current state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The IpInventory API current state. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Done("DONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * resource. Use
     * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/latest/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the resource.
     */
    private String dataRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * resource. Use
     * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/latest/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the resource.
     *
     * @return the value
     */
    public String getDataRequestId() {
        return dataRequestId;
    }

    /** The returned {@code IpInventoryVcnOverlapCollection} instance. */
    private com.oracle.bmc.core.model.IpInventoryVcnOverlapCollection
            ipInventoryVcnOverlapCollection;

    /**
     * The returned {@code IpInventoryVcnOverlapCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.core.model.IpInventoryVcnOverlapCollection
            getIpInventoryVcnOverlapCollection() {
        return ipInventoryVcnOverlapCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "opcTotalItems",
        "opcWorkRequestId",
        "lifecycleState",
        "dataRequestId",
        "ipInventoryVcnOverlapCollection"
    })
    private GetVcnOverlapResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            Integer opcTotalItems,
            String opcWorkRequestId,
            LifecycleState lifecycleState,
            String dataRequestId,
            com.oracle.bmc.core.model.IpInventoryVcnOverlapCollection
                    ipInventoryVcnOverlapCollection) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcTotalItems = opcTotalItems;
        this.opcWorkRequestId = opcWorkRequestId;
        this.lifecycleState = lifecycleState;
        this.dataRequestId = dataRequestId;
        this.ipInventoryVcnOverlapCollection = ipInventoryVcnOverlapCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetVcnOverlapResponse> {
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

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
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

        /** For list pagination. A pagination token to get the total number of results available. */
        private Integer opcTotalItems;

        /**
         * For list pagination. A pagination token to get the total number of results available.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * work request. Use
         * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/latest/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the request.
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * work request. Use
         * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/latest/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** The IpInventory API current state. */
        private LifecycleState lifecycleState;

        /**
         * The IpInventory API current state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource. Use
         * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/latest/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the resource.
         */
        private String dataRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource. Use
         * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/latest/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the resource.
         *
         * @param dataRequestId the value to set
         * @return this builder
         */
        public Builder dataRequestId(String dataRequestId) {
            this.dataRequestId = dataRequestId;
            return this;
        }

        /** The returned {@code IpInventoryVcnOverlapCollection} instance. */
        private com.oracle.bmc.core.model.IpInventoryVcnOverlapCollection
                ipInventoryVcnOverlapCollection;

        /**
         * The returned {@code IpInventoryVcnOverlapCollection} instance.
         *
         * @param ipInventoryVcnOverlapCollection the value to set
         * @return this builder
         */
        public Builder ipInventoryVcnOverlapCollection(
                com.oracle.bmc.core.model.IpInventoryVcnOverlapCollection
                        ipInventoryVcnOverlapCollection) {
            this.ipInventoryVcnOverlapCollection = ipInventoryVcnOverlapCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetVcnOverlapResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcTotalItems(o.getOpcTotalItems());
            opcWorkRequestId(o.getOpcWorkRequestId());
            lifecycleState(o.getLifecycleState());
            dataRequestId(o.getDataRequestId());
            ipInventoryVcnOverlapCollection(o.getIpInventoryVcnOverlapCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetVcnOverlapResponse build() {
            return new GetVcnOverlapResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    opcTotalItems,
                    opcWorkRequestId,
                    lifecycleState,
                    dataRequestId,
                    ipInventoryVcnOverlapCollection);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",lifecycleState=").append(String.valueOf(lifecycleState));
        sb.append(",dataRequestId=").append(String.valueOf(dataRequestId));
        sb.append(",ipInventoryVcnOverlapCollection=")
                .append(String.valueOf(ipInventoryVcnOverlapCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetVcnOverlapResponse)) {
            return false;
        }

        GetVcnOverlapResponse other = (GetVcnOverlapResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.dataRequestId, other.dataRequestId)
                && java.util.Objects.equals(
                        this.ipInventoryVcnOverlapCollection,
                        other.ipInventoryVcnOverlapCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.dataRequestId == null ? 43 : this.dataRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.ipInventoryVcnOverlapCollection == null
                                ? 43
                                : this.ipInventoryVcnOverlapCollection.hashCode());
        return result;
    }
}
