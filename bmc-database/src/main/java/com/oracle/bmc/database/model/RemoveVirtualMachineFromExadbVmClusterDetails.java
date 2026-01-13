/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of removing Virtual Machines from the Exadata VM cluster on Exascale Infrastructure.
 * Applies to Exadata Database Service on Exascale Infrastructure only. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RemoveVirtualMachineFromExadbVmClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoveVirtualMachineFromExadbVmClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbNodes"})
    public RemoveVirtualMachineFromExadbVmClusterDetails(java.util.List<DbNodeDetails> dbNodes) {
        super();
        this.dbNodes = dbNodes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of ExaCS DB nodes for the Exadata VM cluster on Exascale Infrastructure to be
         * removed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodes")
        private java.util.List<DbNodeDetails> dbNodes;

        /**
         * The list of ExaCS DB nodes for the Exadata VM cluster on Exascale Infrastructure to be
         * removed.
         *
         * @param dbNodes the value to set
         * @return this builder
         */
        public Builder dbNodes(java.util.List<DbNodeDetails> dbNodes) {
            this.dbNodes = dbNodes;
            this.__explicitlySet__.add("dbNodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveVirtualMachineFromExadbVmClusterDetails build() {
            RemoveVirtualMachineFromExadbVmClusterDetails model =
                    new RemoveVirtualMachineFromExadbVmClusterDetails(this.dbNodes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveVirtualMachineFromExadbVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("dbNodes")) {
                this.dbNodes(model.getDbNodes());
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

    /**
     * The list of ExaCS DB nodes for the Exadata VM cluster on Exascale Infrastructure to be
     * removed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodes")
    private final java.util.List<DbNodeDetails> dbNodes;

    /**
     * The list of ExaCS DB nodes for the Exadata VM cluster on Exascale Infrastructure to be
     * removed.
     *
     * @return the value
     */
    public java.util.List<DbNodeDetails> getDbNodes() {
        return dbNodes;
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
        sb.append("RemoveVirtualMachineFromExadbVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dbNodes=").append(String.valueOf(this.dbNodes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveVirtualMachineFromExadbVmClusterDetails)) {
            return false;
        }

        RemoveVirtualMachineFromExadbVmClusterDetails other =
                (RemoveVirtualMachineFromExadbVmClusterDetails) o;
        return java.util.Objects.equals(this.dbNodes, other.dbNodes) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbNodes == null ? 43 : this.dbNodes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
