/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Oracle Identity Cloud Service Group <br>
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
        builder = ExtensionGroupGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionGroupGroup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "creationMechanism",
        "passwordPolicy",
        "syncedFromApp",
        "grants",
        "owners",
        "appRoles"
    })
    public ExtensionGroupGroup(
            String description,
            CreationMechanism creationMechanism,
            GroupExtPasswordPolicy passwordPolicy,
            GroupExtSyncedFromApp syncedFromApp,
            java.util.List<GroupExtGrants> grants,
            java.util.List<GroupExtOwners> owners,
            java.util.List<GroupExtAppRoles> appRoles) {
        super();
        this.description = description;
        this.creationMechanism = creationMechanism;
        this.passwordPolicy = passwordPolicy;
        this.syncedFromApp = syncedFromApp;
        this.grants = grants;
        this.owners = owners;
        this.appRoles = appRoles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Group description
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Description -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Description]] - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Group description
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Description -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Description]] - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * string - uniqueness: none
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Source from which this group got created.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
         * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("creationMechanism")
        private CreationMechanism creationMechanism;

        /**
         * Source from which this group got created.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
         * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: request - type: string - uniqueness: none
         *
         * @param creationMechanism the value to set
         * @return this builder
         */
        public Builder creationMechanism(CreationMechanism creationMechanism) {
            this.creationMechanism = creationMechanism;
            this.__explicitlySet__.add("creationMechanism");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordPolicy")
        private GroupExtPasswordPolicy passwordPolicy;

        public Builder passwordPolicy(GroupExtPasswordPolicy passwordPolicy) {
            this.passwordPolicy = passwordPolicy;
            this.__explicitlySet__.add("passwordPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("syncedFromApp")
        private GroupExtSyncedFromApp syncedFromApp;

        public Builder syncedFromApp(GroupExtSyncedFromApp syncedFromApp) {
            this.syncedFromApp = syncedFromApp;
            this.__explicitlySet__.add("syncedFromApp");
            return this;
        }
        /**
         * Grants assigned to group
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("grants")
        private java.util.List<GroupExtGrants> grants;

        /**
         * Grants assigned to group
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         *
         * @param grants the value to set
         * @return this builder
         */
        public Builder grants(java.util.List<GroupExtGrants> grants) {
            this.grants = grants;
            this.__explicitlySet__.add("grants");
            return this;
        }
        /**
         * Group owners
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value, type] -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: request - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("owners")
        private java.util.List<GroupExtOwners> owners;

        /**
         * Group owners
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value, type] -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: request - type: complex - uniqueness: none
         *
         * @param owners the value to set
         * @return this builder
         */
        public Builder owners(java.util.List<GroupExtOwners> owners) {
            this.owners = owners;
            this.__explicitlySet__.add("owners");
            return this;
        }
        /**
         * A list of appRoles that the user belongs to, either thorough direct membership, nested
         * groups, or dynamically calculated
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readOnly - required: false - returned: request -
         * type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appRoles")
        private java.util.List<GroupExtAppRoles> appRoles;

        /**
         * A list of appRoles that the user belongs to, either thorough direct membership, nested
         * groups, or dynamically calculated
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readOnly - required: false - returned: request -
         * type: complex - uniqueness: none
         *
         * @param appRoles the value to set
         * @return this builder
         */
        public Builder appRoles(java.util.List<GroupExtAppRoles> appRoles) {
            this.appRoles = appRoles;
            this.__explicitlySet__.add("appRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionGroupGroup build() {
            ExtensionGroupGroup model =
                    new ExtensionGroupGroup(
                            this.description,
                            this.creationMechanism,
                            this.passwordPolicy,
                            this.syncedFromApp,
                            this.grants,
                            this.owners,
                            this.appRoles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionGroupGroup model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("creationMechanism")) {
                this.creationMechanism(model.getCreationMechanism());
            }
            if (model.wasPropertyExplicitlySet("passwordPolicy")) {
                this.passwordPolicy(model.getPasswordPolicy());
            }
            if (model.wasPropertyExplicitlySet("syncedFromApp")) {
                this.syncedFromApp(model.getSyncedFromApp());
            }
            if (model.wasPropertyExplicitlySet("grants")) {
                this.grants(model.getGrants());
            }
            if (model.wasPropertyExplicitlySet("owners")) {
                this.owners(model.getOwners());
            }
            if (model.wasPropertyExplicitlySet("appRoles")) {
                this.appRoles(model.getAppRoles());
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
     * Group description
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Description -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Description]] - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Group description
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Description -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Description]] - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Source from which this group got created.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
     * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability: immutable -
     * required: false - returned: request - type: string - uniqueness: none
     */
    public enum CreationMechanism implements com.oracle.bmc.http.internal.BmcEnum {
        Bulk("bulk"),
        Api("api"),
        Adsync("adsync"),
        Authsync("authsync"),
        Idcsui("idcsui"),
        Import("import"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CreationMechanism.class);

        private final String value;
        private static java.util.Map<String, CreationMechanism> map;

        static {
            map = new java.util.HashMap<>();
            for (CreationMechanism v : CreationMechanism.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CreationMechanism(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CreationMechanism create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CreationMechanism', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Source from which this group got created.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
     * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability: immutable -
     * required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("creationMechanism")
    private final CreationMechanism creationMechanism;

    /**
     * Source from which this group got created.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
     * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability: immutable -
     * required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public CreationMechanism getCreationMechanism() {
        return creationMechanism;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("passwordPolicy")
    private final GroupExtPasswordPolicy passwordPolicy;

    public GroupExtPasswordPolicy getPasswordPolicy() {
        return passwordPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("syncedFromApp")
    private final GroupExtSyncedFromApp syncedFromApp;

    public GroupExtSyncedFromApp getSyncedFromApp() {
        return syncedFromApp;
    }

    /**
     * Grants assigned to group
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grants")
    private final java.util.List<GroupExtGrants> grants;

    /**
     * Grants assigned to group
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<GroupExtGrants> getGrants() {
        return grants;
    }

    /**
     * Group owners
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value, type] -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("owners")
    private final java.util.List<GroupExtOwners> owners;

    /**
     * Group owners
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value, type] -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<GroupExtOwners> getOwners() {
        return owners;
    }

    /**
     * A list of appRoles that the user belongs to, either thorough direct membership, nested
     * groups, or dynamically calculated
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
     * true - multiValued: true - mutability: readOnly - required: false - returned: request - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appRoles")
    private final java.util.List<GroupExtAppRoles> appRoles;

    /**
     * A list of appRoles that the user belongs to, either thorough direct membership, nested
     * groups, or dynamically calculated
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
     * true - multiValued: true - mutability: readOnly - required: false - returned: request - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<GroupExtAppRoles> getAppRoles() {
        return appRoles;
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
        sb.append("ExtensionGroupGroup(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", creationMechanism=").append(String.valueOf(this.creationMechanism));
        sb.append(", passwordPolicy=").append(String.valueOf(this.passwordPolicy));
        sb.append(", syncedFromApp=").append(String.valueOf(this.syncedFromApp));
        sb.append(", grants=").append(String.valueOf(this.grants));
        sb.append(", owners=").append(String.valueOf(this.owners));
        sb.append(", appRoles=").append(String.valueOf(this.appRoles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionGroupGroup)) {
            return false;
        }

        ExtensionGroupGroup other = (ExtensionGroupGroup) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.creationMechanism, other.creationMechanism)
                && java.util.Objects.equals(this.passwordPolicy, other.passwordPolicy)
                && java.util.Objects.equals(this.syncedFromApp, other.syncedFromApp)
                && java.util.Objects.equals(this.grants, other.grants)
                && java.util.Objects.equals(this.owners, other.owners)
                && java.util.Objects.equals(this.appRoles, other.appRoles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.creationMechanism == null ? 43 : this.creationMechanism.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordPolicy == null ? 43 : this.passwordPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.syncedFromApp == null ? 43 : this.syncedFromApp.hashCode());
        result = (result * PRIME) + (this.grants == null ? 43 : this.grants.hashCode());
        result = (result * PRIME) + (this.owners == null ? 43 : this.owners.hashCode());
        result = (result * PRIME) + (this.appRoles == null ? 43 : this.appRoles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
