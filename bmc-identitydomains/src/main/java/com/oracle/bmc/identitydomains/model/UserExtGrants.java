/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Grants to this User. Each value of this attribute refers to a Grant to this User of some App (and
 * optionally of some entitlement). Therefore, this attribute is a convenience that allows one to
 * see on each User all of the Grants to that User.
 *
 * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability: readOnly -
 * required: false - returned: request - type: complex - uniqueness: none <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserExtGrants.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UserExtGrants extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ref", "appId", "grantMechanism", "grantorId"})
    public UserExtGrants(
            String value,
            String ref,
            String appId,
            GrantMechanism grantMechanism,
            String grantorId) {
        super();
        this.value = value;
        this.ref = ref;
        this.appId = appId;
        this.grantMechanism = grantMechanism;
        this.grantorId = grantorId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of this Grant to this User.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The ID of this Grant to this User.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The URI of this Grant to this User.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * The URI of this Grant to this User.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         *
         * @param ref the value to set
         * @return this builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * The ID of the App in this Grant.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appId")
        private String appId;

        /**
         * The ID of the App in this Grant.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param appId the value to set
         * @return this builder
         */
        public Builder appId(String appId) {
            this.appId = appId;
            this.__explicitlySet__.add("appId");
            return this;
        }
        /**
         * Each value of grantMechanism indicates how (or by what component) some App (or
         * App-Entitlement) was granted. A customer or the UI should use only grantMechanism values
         * that start with 'ADMINISTRATOR': - 'ADMINISTRATOR_TO_USER' is for a direct grant to a
         * specific User. - 'ADMINISTRATOR_TO_GROUP' is for a grant to a specific Group, which
         * results in indirect grants to Users who are members of that Group. -
         * 'ADMINISTRATOR_TO_APP' is for a grant to a specific App. The grantee (client) App gains
         * access to the granted (server) App.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("grantMechanism")
        private GrantMechanism grantMechanism;

        /**
         * Each value of grantMechanism indicates how (or by what component) some App (or
         * App-Entitlement) was granted. A customer or the UI should use only grantMechanism values
         * that start with 'ADMINISTRATOR': - 'ADMINISTRATOR_TO_USER' is for a direct grant to a
         * specific User. - 'ADMINISTRATOR_TO_GROUP' is for a grant to a specific Group, which
         * results in indirect grants to Users who are members of that Group. -
         * 'ADMINISTRATOR_TO_APP' is for a grant to a specific App. The grantee (client) App gains
         * access to the granted (server) App.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param grantMechanism the value to set
         * @return this builder
         */
        public Builder grantMechanism(GrantMechanism grantMechanism) {
            this.grantMechanism = grantMechanism;
            this.__explicitlySet__.add("grantMechanism");
            return this;
        }
        /**
         * Grantor identifier
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("grantorId")
        private String grantorId;

        /**
         * Grantor identifier
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param grantorId the value to set
         * @return this builder
         */
        public Builder grantorId(String grantorId) {
            this.grantorId = grantorId;
            this.__explicitlySet__.add("grantorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtGrants build() {
            UserExtGrants model =
                    new UserExtGrants(
                            this.value, this.ref, this.appId, this.grantMechanism, this.grantorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtGrants model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("appId")) {
                this.appId(model.getAppId());
            }
            if (model.wasPropertyExplicitlySet("grantMechanism")) {
                this.grantMechanism(model.getGrantMechanism());
            }
            if (model.wasPropertyExplicitlySet("grantorId")) {
                this.grantorId(model.getGrantorId());
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
     * The ID of this Grant to this User.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The ID of this Grant to this User.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The URI of this Grant to this User.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * The URI of this Grant to this User.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * The ID of the App in this Grant.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appId")
    private final String appId;

    /**
     * The ID of the App in this Grant.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Each value of grantMechanism indicates how (or by what component) some App (or
     * App-Entitlement) was granted. A customer or the UI should use only grantMechanism values that
     * start with 'ADMINISTRATOR': - 'ADMINISTRATOR_TO_USER' is for a direct grant to a specific
     * User. - 'ADMINISTRATOR_TO_GROUP' is for a grant to a specific Group, which results in
     * indirect grants to Users who are members of that Group. - 'ADMINISTRATOR_TO_APP' is for a
     * grant to a specific App. The grantee (client) App gains access to the granted (server) App.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    public enum GrantMechanism implements com.oracle.bmc.http.internal.BmcEnum {
        ImportApproleMembers("IMPORT_APPROLE_MEMBERS"),
        AdministratorToUser("ADMINISTRATOR_TO_USER"),
        AdministratorToGroup("ADMINISTRATOR_TO_GROUP"),
        ServiceManagerToUser("SERVICE_MANAGER_TO_USER"),
        AdministratorToApp("ADMINISTRATOR_TO_APP"),
        ServiceManagerToApp("SERVICE_MANAGER_TO_APP"),
        OpcInfraToApp("OPC_INFRA_TO_APP"),
        GroupMembership("GROUP_MEMBERSHIP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GrantMechanism.class);

        private final String value;
        private static java.util.Map<String, GrantMechanism> map;

        static {
            map = new java.util.HashMap<>();
            for (GrantMechanism v : GrantMechanism.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GrantMechanism(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GrantMechanism create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GrantMechanism', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Each value of grantMechanism indicates how (or by what component) some App (or
     * App-Entitlement) was granted. A customer or the UI should use only grantMechanism values that
     * start with 'ADMINISTRATOR': - 'ADMINISTRATOR_TO_USER' is for a direct grant to a specific
     * User. - 'ADMINISTRATOR_TO_GROUP' is for a grant to a specific Group, which results in
     * indirect grants to Users who are members of that Group. - 'ADMINISTRATOR_TO_APP' is for a
     * grant to a specific App. The grantee (client) App gains access to the granted (server) App.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grantMechanism")
    private final GrantMechanism grantMechanism;

    /**
     * Each value of grantMechanism indicates how (or by what component) some App (or
     * App-Entitlement) was granted. A customer or the UI should use only grantMechanism values that
     * start with 'ADMINISTRATOR': - 'ADMINISTRATOR_TO_USER' is for a direct grant to a specific
     * User. - 'ADMINISTRATOR_TO_GROUP' is for a grant to a specific Group, which results in
     * indirect grants to Users who are members of that Group. - 'ADMINISTRATOR_TO_APP' is for a
     * grant to a specific App. The grantee (client) App gains access to the granted (server) App.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public GrantMechanism getGrantMechanism() {
        return grantMechanism;
    }

    /**
     * Grantor identifier
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grantorId")
    private final String grantorId;

    /**
     * Grantor identifier
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getGrantorId() {
        return grantorId;
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
        sb.append("UserExtGrants(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", appId=").append(String.valueOf(this.appId));
        sb.append(", grantMechanism=").append(String.valueOf(this.grantMechanism));
        sb.append(", grantorId=").append(String.valueOf(this.grantorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtGrants)) {
            return false;
        }

        UserExtGrants other = (UserExtGrants) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.appId, other.appId)
                && java.util.Objects.equals(this.grantMechanism, other.grantMechanism)
                && java.util.Objects.equals(this.grantorId, other.grantorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.appId == null ? 43 : this.appId.hashCode());
        result =
                (result * PRIME)
                        + (this.grantMechanism == null ? 43 : this.grantMechanism.hashCode());
        result = (result * PRIME) + (this.grantorId == null ? 43 : this.grantorId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
