/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details to update an Oracle Autonomous Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AdbUpdateDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdbUpdateDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "ecpu",
        "dataStorageSizeInTBs",
        "isMtlsConnectionRequired"
    })
    public AdbUpdateDetail(
            String instanceId,
            Integer ecpu,
            Integer dataStorageSizeInTBs,
            Boolean isMtlsConnectionRequired) {
        super();
        this.instanceId = instanceId;
        this.ecpu = ecpu;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.isMtlsConnectionRequired = isMtlsConnectionRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Id of the existing ADB instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Id of the existing ADB instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The compute amount (ECPUs) available to the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("ecpu")
        private Integer ecpu;

        /**
         * The compute amount (ECPUs) available to the database.
         *
         * @param ecpu the value to set
         * @return this builder
         */
        public Builder ecpu(Integer ecpu) {
            this.ecpu = ecpu;
            this.__explicitlySet__.add("ecpu");
            return this;
        }
        /**
         * The size, in terabytes, of the data volume that will be created and attached to the
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Integer dataStorageSizeInTBs;

        /**
         * The size, in terabytes, of the data volume that will be created and attached to the
         * database.
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInTBs(Integer dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /** Specifies if the Autonomous Database requires mTLS connections. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
        private Boolean isMtlsConnectionRequired;

        /**
         * Specifies if the Autonomous Database requires mTLS connections.
         *
         * @param isMtlsConnectionRequired the value to set
         * @return this builder
         */
        public Builder isMtlsConnectionRequired(Boolean isMtlsConnectionRequired) {
            this.isMtlsConnectionRequired = isMtlsConnectionRequired;
            this.__explicitlySet__.add("isMtlsConnectionRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdbUpdateDetail build() {
            AdbUpdateDetail model =
                    new AdbUpdateDetail(
                            this.instanceId,
                            this.ecpu,
                            this.dataStorageSizeInTBs,
                            this.isMtlsConnectionRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdbUpdateDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("ecpu")) {
                this.ecpu(model.getEcpu());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("isMtlsConnectionRequired")) {
                this.isMtlsConnectionRequired(model.getIsMtlsConnectionRequired());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Id of the existing ADB instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Id of the existing ADB instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** The compute amount (ECPUs) available to the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("ecpu")
    private final Integer ecpu;

    /**
     * The compute amount (ECPUs) available to the database.
     *
     * @return the value
     */
    public Integer getEcpu() {
        return ecpu;
    }

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Integer dataStorageSizeInTBs;

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /** Specifies if the Autonomous Database requires mTLS connections. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
    private final Boolean isMtlsConnectionRequired;

    /**
     * Specifies if the Autonomous Database requires mTLS connections.
     *
     * @return the value
     */
    public Boolean getIsMtlsConnectionRequired() {
        return isMtlsConnectionRequired;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdbUpdateDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", ecpu=").append(String.valueOf(this.ecpu));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", isMtlsConnectionRequired=")
                .append(String.valueOf(this.isMtlsConnectionRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdbUpdateDetail)) {
            return false;
        }

        AdbUpdateDetail other = (AdbUpdateDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.ecpu, other.ecpu)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.isMtlsConnectionRequired, other.isMtlsConnectionRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.ecpu == null ? 43 : this.ecpu.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsConnectionRequired == null
                                ? 43
                                : this.isMtlsConnectionRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
