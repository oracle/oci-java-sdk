/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emwarehouse.model;

/**
 * Results of a emWarehouse search. Contains boh EmWarehouseSummary items and other information, such as metadata.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EmInstancesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmInstancesDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"emId", "targetsCount", "emHost", "emDiscovererUrl"})
    public EmInstancesDetails(
            String emId, Integer targetsCount, String emHost, String emDiscovererUrl) {
        super();
        this.emId = emId;
        this.targetsCount = targetsCount;
        this.emHost = emHost;
        this.emDiscovererUrl = emDiscovererUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * operations Insights Warehouse Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emId")
        private String emId;

        /**
         * operations Insights Warehouse Identifier
         * @param emId the value to set
         * @return this builder
         **/
        public Builder emId(String emId) {
            this.emId = emId;
            this.__explicitlySet__.add("emId");
            return this;
        }
        /**
         * EmInstance Target count
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
        private Integer targetsCount;

        /**
         * EmInstance Target count
         * @param targetsCount the value to set
         * @return this builder
         **/
        public Builder targetsCount(Integer targetsCount) {
            this.targetsCount = targetsCount;
            this.__explicitlySet__.add("targetsCount");
            return this;
        }
        /**
         * emHost name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emHost")
        private String emHost;

        /**
         * emHost name
         * @param emHost the value to set
         * @return this builder
         **/
        public Builder emHost(String emHost) {
            this.emHost = emHost;
            this.__explicitlySet__.add("emHost");
            return this;
        }
        /**
         * emdDiscoverer url
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emDiscovererUrl")
        private String emDiscovererUrl;

        /**
         * emdDiscoverer url
         * @param emDiscovererUrl the value to set
         * @return this builder
         **/
        public Builder emDiscovererUrl(String emDiscovererUrl) {
            this.emDiscovererUrl = emDiscovererUrl;
            this.__explicitlySet__.add("emDiscovererUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmInstancesDetails build() {
            EmInstancesDetails model =
                    new EmInstancesDetails(
                            this.emId, this.targetsCount, this.emHost, this.emDiscovererUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmInstancesDetails model) {
            if (model.wasPropertyExplicitlySet("emId")) {
                this.emId(model.getEmId());
            }
            if (model.wasPropertyExplicitlySet("targetsCount")) {
                this.targetsCount(model.getTargetsCount());
            }
            if (model.wasPropertyExplicitlySet("emHost")) {
                this.emHost(model.getEmHost());
            }
            if (model.wasPropertyExplicitlySet("emDiscovererUrl")) {
                this.emDiscovererUrl(model.getEmDiscovererUrl());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * operations Insights Warehouse Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emId")
    private final String emId;

    /**
     * operations Insights Warehouse Identifier
     * @return the value
     **/
    public String getEmId() {
        return emId;
    }

    /**
     * EmInstance Target count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
    private final Integer targetsCount;

    /**
     * EmInstance Target count
     * @return the value
     **/
    public Integer getTargetsCount() {
        return targetsCount;
    }

    /**
     * emHost name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emHost")
    private final String emHost;

    /**
     * emHost name
     * @return the value
     **/
    public String getEmHost() {
        return emHost;
    }

    /**
     * emdDiscoverer url
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emDiscovererUrl")
    private final String emDiscovererUrl;

    /**
     * emdDiscoverer url
     * @return the value
     **/
    public String getEmDiscovererUrl() {
        return emDiscovererUrl;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EmInstancesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("emId=").append(String.valueOf(this.emId));
        sb.append(", targetsCount=").append(String.valueOf(this.targetsCount));
        sb.append(", emHost=").append(String.valueOf(this.emHost));
        sb.append(", emDiscovererUrl=").append(String.valueOf(this.emDiscovererUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmInstancesDetails)) {
            return false;
        }

        EmInstancesDetails other = (EmInstancesDetails) o;
        return java.util.Objects.equals(this.emId, other.emId)
                && java.util.Objects.equals(this.targetsCount, other.targetsCount)
                && java.util.Objects.equals(this.emHost, other.emHost)
                && java.util.Objects.equals(this.emDiscovererUrl, other.emDiscovererUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.emId == null ? 43 : this.emId.hashCode());
        result = (result * PRIME) + (this.targetsCount == null ? 43 : this.targetsCount.hashCode());
        result = (result * PRIME) + (this.emHost == null ? 43 : this.emHost.hashCode());
        result =
                (result * PRIME)
                        + (this.emDiscovererUrl == null ? 43 : this.emDiscovererUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
