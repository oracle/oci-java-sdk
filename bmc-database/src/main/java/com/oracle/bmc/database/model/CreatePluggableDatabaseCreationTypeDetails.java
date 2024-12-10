/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Pluggable Database creation type.
 * Use {@code LOCAL_CLONE_PDB} for creating a new PDB using Local Clone on Source Pluggable Database. This will Clone and starts a
 * pluggable database (PDB) in the same database (CDB) as the source PDB. The source PDB must be in the {@code READ_WRITE} openMode to
 * perform the clone operation.
 * isThinClone options are supported for Exadata VM cluster on Exascale Infrastructure, Exadata Cloud@Customer VM Cluster on Exadata Cloud@Customer infrastructure, and Exadata Cloud VM cluster on cloud Exadata infrastructure
 * Use {@code REMOTE_CLONE_PDB} for creating a new PDB using Remote Clone on Source Pluggable Database. This will Clone a pluggable
 * database (PDB) to a different database from the source PDB. The cloned PDB will be started upon completion of the clone
 * operation. The source PDB must be in the {@code READ_WRITE} openMode when performing the clone.
 * For Exadata Cloud@Customer instances, the source pluggable database (PDB) must be on the same Exadata Infrastructure as the
 * target container database (CDB) to create a remote clone.
 * isThinClone options are supported for Exadata VM cluster on Exascale Infrastructure, Exadata Cloud@Customer VM Cluster on Exadata Cloud@Customer infrastructure, and Exadata Cloud VM cluster on cloud Exadata infrastructure.
 * Use {@code RELOCATE_PDB} for relocating the Pluggable Database from Source CDB and creating it in target CDB. This will relocate a
 * pluggable database (PDB) to a different database from the source PDB. The source PDB must be in the {@code READ_WRITE} openMode when
 * performing the relocate.
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "creationType",
    defaultImpl = CreatePluggableDatabaseCreationTypeDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreatePluggableDatabaseFromRelocateDetails.class,
        name = "RELOCATE_PDB"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreatePluggableDatabaseFromRemoteCloneDetails.class,
        name = "REMOTE_CLONE_PDB"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreatePluggableDatabaseFromLocalCloneDetails.class,
        name = "LOCAL_CLONE_PDB"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreatePluggableDatabaseCreationTypeDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected CreatePluggableDatabaseCreationTypeDetails() {
        super();
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
        sb.append("CreatePluggableDatabaseCreationTypeDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePluggableDatabaseCreationTypeDetails)) {
            return false;
        }

        CreatePluggableDatabaseCreationTypeDetails other =
                (CreatePluggableDatabaseCreationTypeDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The Pluggable Database creation type.
     **/
    public enum CreationType {
        LocalClonePdb("LOCAL_CLONE_PDB"),
        RemoteClonePdb("REMOTE_CLONE_PDB"),
        RelocatePdb("RELOCATE_PDB"),
        ;

        private final String value;
        private static java.util.Map<String, CreationType> map;

        static {
            map = new java.util.HashMap<>();
            for (CreationType v : CreationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CreationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CreationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CreationType: " + key);
        }
    };
}
