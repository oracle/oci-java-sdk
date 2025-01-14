/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * DBCS instance-level schema-names. Each schema-name is specific to a DB Instance.
 *
 * <p>*Added In:** 18.2.4
 *
 * <p>*SCIM++ Properties:** - idcsCompositeKey: [dbInstanceId, schemaName] - idcsSearchable: true -
 * multiValued: true - mutability: readOnly - required: false - returned: request - type: complex
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GroupExtInstanceLevelSchemaNames.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GroupExtInstanceLevelSchemaNames
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbInstanceId", "schemaName"})
    public GroupExtInstanceLevelSchemaNames(String dbInstanceId, String schemaName) {
        super();
        this.dbInstanceId = dbInstanceId;
        this.schemaName = schemaName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * App Id of DBCS App instance
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbInstanceId")
        private String dbInstanceId;

        /**
         * App Id of DBCS App instance
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param dbInstanceId the value to set
         * @return this builder
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            this.__explicitlySet__.add("dbInstanceId");
            return this;
        }
        /**
         * The DBCS schema-name granted to this Group for the DB instance that 'dbInstanceId'
         * specifies.
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The DBCS schema-name granted to this Group for the DB instance that 'dbInstanceId'
         * specifies.
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GroupExtInstanceLevelSchemaNames build() {
            GroupExtInstanceLevelSchemaNames model =
                    new GroupExtInstanceLevelSchemaNames(this.dbInstanceId, this.schemaName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GroupExtInstanceLevelSchemaNames model) {
            if (model.wasPropertyExplicitlySet("dbInstanceId")) {
                this.dbInstanceId(model.getDbInstanceId());
            }
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
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
     * App Id of DBCS App instance
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbInstanceId")
    private final String dbInstanceId;

    /**
     * App Id of DBCS App instance
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDbInstanceId() {
        return dbInstanceId;
    }

    /**
     * The DBCS schema-name granted to this Group for the DB instance that 'dbInstanceId' specifies.
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The DBCS schema-name granted to this Group for the DB instance that 'dbInstanceId' specifies.
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
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
        sb.append("GroupExtInstanceLevelSchemaNames(");
        sb.append("super=").append(super.toString());
        sb.append("dbInstanceId=").append(String.valueOf(this.dbInstanceId));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupExtInstanceLevelSchemaNames)) {
            return false;
        }

        GroupExtInstanceLevelSchemaNames other = (GroupExtInstanceLevelSchemaNames) o;
        return java.util.Objects.equals(this.dbInstanceId, other.dbInstanceId)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbInstanceId == null ? 43 : this.dbInstanceId.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
