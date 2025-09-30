/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The details about attachment of datastore <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatastoreAttachment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatastoreAttachment
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "volumeIqn",
        "blockVolumeId",
        "datastoreId",
        "ipAddress",
        "port"
    })
    public DatastoreAttachment(
            String volumeIqn,
            String blockVolumeId,
            String datastoreId,
            String ipAddress,
            Integer port) {
        super();
        this.volumeIqn = volumeIqn;
        this.blockVolumeId = blockVolumeId;
        this.datastoreId = datastoreId;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An IQN of the Block Storage Volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeIqn")
        private String volumeIqn;

        /**
         * An IQN of the Block Storage Volume.
         *
         * @param volumeIqn the value to set
         * @return this builder
         */
        public Builder volumeIqn(String volumeIqn) {
            this.volumeIqn = volumeIqn;
            this.__explicitlySet__.add("volumeIqn");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Block Volume that belongs to the datastore.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeId")
        private String blockVolumeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Block Volume that belongs to the datastore.
         *
         * @param blockVolumeId the value to set
         * @return this builder
         */
        public Builder blockVolumeId(String blockVolumeId) {
            this.blockVolumeId = blockVolumeId;
            this.__explicitlySet__.add("blockVolumeId");
            return this;
        }
        /**
         * The [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Datastore that ESXi host is attached to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("datastoreId")
        private String datastoreId;

        /**
         * The [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Datastore that ESXi host is attached to.
         *
         * @param datastoreId the value to set
         * @return this builder
         */
        public Builder datastoreId(String datastoreId) {
            this.datastoreId = datastoreId;
            this.__explicitlySet__.add("datastoreId");
            return this;
        }
        /** The IP address of datastore attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address of datastore attachment.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** The port of datastore attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port of datastore attachment.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatastoreAttachment build() {
            DatastoreAttachment model =
                    new DatastoreAttachment(
                            this.volumeIqn,
                            this.blockVolumeId,
                            this.datastoreId,
                            this.ipAddress,
                            this.port);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatastoreAttachment model) {
            if (model.wasPropertyExplicitlySet("volumeIqn")) {
                this.volumeIqn(model.getVolumeIqn());
            }
            if (model.wasPropertyExplicitlySet("blockVolumeId")) {
                this.blockVolumeId(model.getBlockVolumeId());
            }
            if (model.wasPropertyExplicitlySet("datastoreId")) {
                this.datastoreId(model.getDatastoreId());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
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

    /** An IQN of the Block Storage Volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeIqn")
    private final String volumeIqn;

    /**
     * An IQN of the Block Storage Volume.
     *
     * @return the value
     */
    public String getVolumeIqn() {
        return volumeIqn;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Block Volume that belongs to the datastore.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeId")
    private final String blockVolumeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Block Volume that belongs to the datastore.
     *
     * @return the value
     */
    public String getBlockVolumeId() {
        return blockVolumeId;
    }

    /**
     * The [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Datastore that ESXi host is attached to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datastoreId")
    private final String datastoreId;

    /**
     * The [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Datastore that ESXi host is attached to.
     *
     * @return the value
     */
    public String getDatastoreId() {
        return datastoreId;
    }

    /** The IP address of datastore attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address of datastore attachment.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** The port of datastore attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port of datastore attachment.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
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
        sb.append("DatastoreAttachment(");
        sb.append("super=").append(super.toString());
        sb.append("volumeIqn=").append(String.valueOf(this.volumeIqn));
        sb.append(", blockVolumeId=").append(String.valueOf(this.blockVolumeId));
        sb.append(", datastoreId=").append(String.valueOf(this.datastoreId));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatastoreAttachment)) {
            return false;
        }

        DatastoreAttachment other = (DatastoreAttachment) o;
        return java.util.Objects.equals(this.volumeIqn, other.volumeIqn)
                && java.util.Objects.equals(this.blockVolumeId, other.blockVolumeId)
                && java.util.Objects.equals(this.datastoreId, other.datastoreId)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.port, other.port)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.volumeIqn == null ? 43 : this.volumeIqn.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeId == null ? 43 : this.blockVolumeId.hashCode());
        result = (result * PRIME) + (this.datastoreId == null ? 43 : this.datastoreId.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
