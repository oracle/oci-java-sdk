/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of adding Virtual Machines to the VM Cluster. Applies to Exadata Cloud@Customer instances only.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddVirtualMachineToVmClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddVirtualMachineToVmClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbServers"})
    public AddVirtualMachineToVmClusterDetails(java.util.List<DbServerDetails> dbServers) {
        super();
        this.dbServers = dbServers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of Exacc DB servers for the cluster to be added.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
        private java.util.List<DbServerDetails> dbServers;

        /**
         * The list of Exacc DB servers for the cluster to be added.
         * @param dbServers the value to set
         * @return this builder
         **/
        public Builder dbServers(java.util.List<DbServerDetails> dbServers) {
            this.dbServers = dbServers;
            this.__explicitlySet__.add("dbServers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddVirtualMachineToVmClusterDetails build() {
            AddVirtualMachineToVmClusterDetails model =
                    new AddVirtualMachineToVmClusterDetails(this.dbServers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddVirtualMachineToVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("dbServers")) {
                this.dbServers(model.getDbServers());
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
     * The list of Exacc DB servers for the cluster to be added.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
    private final java.util.List<DbServerDetails> dbServers;

    /**
     * The list of Exacc DB servers for the cluster to be added.
     * @return the value
     **/
    public java.util.List<DbServerDetails> getDbServers() {
        return dbServers;
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
        sb.append("AddVirtualMachineToVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dbServers=").append(String.valueOf(this.dbServers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddVirtualMachineToVmClusterDetails)) {
            return false;
        }

        AddVirtualMachineToVmClusterDetails other = (AddVirtualMachineToVmClusterDetails) o;
        return java.util.Objects.equals(this.dbServers, other.dbServers) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbServers == null ? 43 : this.dbServers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
