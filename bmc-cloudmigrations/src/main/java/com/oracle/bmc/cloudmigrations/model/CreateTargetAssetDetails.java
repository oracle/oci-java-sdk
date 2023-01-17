/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Details of the new target asset.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = CreateTargetAssetDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateVmTargetAssetDetails.class,
        name = "INSTANCE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateTargetAssetDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"migrationPlanId", "isExcludedFromExecution"})
    protected CreateTargetAssetDetails(String migrationPlanId, Boolean isExcludedFromExecution) {
        super();
        this.migrationPlanId = migrationPlanId;
        this.isExcludedFromExecution = isExcludedFromExecution;
    }

    /**
     * OCID of the associated migration plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("migrationPlanId")
    private final String migrationPlanId;

    /**
     * OCID of the associated migration plan.
     * @return the value
     **/
    public String getMigrationPlanId() {
        return migrationPlanId;
    }

    /**
     * A boolean indicating whether the asset should be migrated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isExcludedFromExecution")
    private final Boolean isExcludedFromExecution;

    /**
     * A boolean indicating whether the asset should be migrated.
     * @return the value
     **/
    public Boolean getIsExcludedFromExecution() {
        return isExcludedFromExecution;
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
        sb.append("CreateTargetAssetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("migrationPlanId=").append(String.valueOf(this.migrationPlanId));
        sb.append(", isExcludedFromExecution=")
                .append(String.valueOf(this.isExcludedFromExecution));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTargetAssetDetails)) {
            return false;
        }

        CreateTargetAssetDetails other = (CreateTargetAssetDetails) o;
        return java.util.Objects.equals(this.migrationPlanId, other.migrationPlanId)
                && java.util.Objects.equals(
                        this.isExcludedFromExecution, other.isExcludedFromExecution)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.migrationPlanId == null ? 43 : this.migrationPlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.isExcludedFromExecution == null
                                ? 43
                                : this.isExcludedFromExecution.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of target asset.
     **/
    public enum Type {
        Instance("INSTANCE"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
}
