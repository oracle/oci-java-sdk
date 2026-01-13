/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details required to create a new Global database services control(GDS CTL) compute node. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddDistributedDatabaseGdsControlNodeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddDistributedDatabaseGdsControlNodeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"publicSshKey", "subnetId"})
    public AddDistributedDatabaseGdsControlNodeDetails(String publicSshKey, String subnetId) {
        super();
        this.publicSshKey = publicSshKey;
        this.subnetId = subnetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The public sshKey for Global database services control(GDS CTL) node. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicSshKey")
        private String publicSshKey;

        /**
         * The public sshKey for Global database services control(GDS CTL) node.
         *
         * @param publicSshKey the value to set
         * @return this builder
         */
        public Builder publicSshKey(String publicSshKey) {
            this.publicSshKey = publicSshKey;
            this.__explicitlySet__.add("publicSshKey");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet on which the Global database services control(GDS CTL) node should be created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet on which the Global database services control(GDS CTL) node should be created.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddDistributedDatabaseGdsControlNodeDetails build() {
            AddDistributedDatabaseGdsControlNodeDetails model =
                    new AddDistributedDatabaseGdsControlNodeDetails(
                            this.publicSshKey, this.subnetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddDistributedDatabaseGdsControlNodeDetails model) {
            if (model.wasPropertyExplicitlySet("publicSshKey")) {
                this.publicSshKey(model.getPublicSshKey());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
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

    /** The public sshKey for Global database services control(GDS CTL) node. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicSshKey")
    private final String publicSshKey;

    /**
     * The public sshKey for Global database services control(GDS CTL) node.
     *
     * @return the value
     */
    public String getPublicSshKey() {
        return publicSshKey;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet on which the Global database services control(GDS CTL) node should be created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet on which the Global database services control(GDS CTL) node should be created.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
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
        sb.append("AddDistributedDatabaseGdsControlNodeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("publicSshKey=").append(String.valueOf(this.publicSshKey));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddDistributedDatabaseGdsControlNodeDetails)) {
            return false;
        }

        AddDistributedDatabaseGdsControlNodeDetails other =
                (AddDistributedDatabaseGdsControlNodeDetails) o;
        return java.util.Objects.equals(this.publicSshKey, other.publicSshKey)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.publicSshKey == null ? 43 : this.publicSshKey.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
