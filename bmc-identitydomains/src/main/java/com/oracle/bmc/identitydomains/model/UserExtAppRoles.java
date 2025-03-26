/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of all AppRoles to which this User belongs directly, indirectly or implicitly. The User could belong directly because the User is a member of the AppRole, could belong indirectly because the User is a member of a Group that is a member of the AppRole, or could belong implicitly because the AppRole is public.
 * <p>
 **SCIM++ Properties:**
 *  - idcsCompositeKey: [value]
 *  - multiValued: true
 *  - mutability: readOnly
 *  - required: false
 *  - returned: request
 *  - type: complex
 *  - uniqueness: none
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserExtAppRoles.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserExtAppRoles extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "value",
        "ref",
        "display",
        "type",
        "appId",
        "appName",
        "adminRole",
        "legacyGroupName"
    })
    public UserExtAppRoles(
            String value,
            String ref,
            String display,
            Type type,
            String appId,
            String appName,
            Boolean adminRole,
            String legacyGroupName) {
        super();
        this.value = value;
        this.ref = ref;
        this.display = display;
        this.type = type;
        this.appId = appId;
        this.appName = appName;
        this.adminRole = adminRole;
        this.legacyGroupName = legacyGroupName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Id of the AppRole assigned to the User.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The Id of the AppRole assigned to the User.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The URI of the AppRole assigned to the User.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * The URI of the AppRole assigned to the User.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         * @param ref the value to set
         * @return this builder
         **/
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * The display name of the AppRole assigned to the User.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * The display name of the AppRole assigned to the User.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param display the value to set
         * @return this builder
         **/
        public Builder display(String display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }
        /**
         * The kind of membership this User has in the AppRole. A value of 'direct' indicates that the User is a member of the AppRole.  A value of  'indirect' indicates that the User is a member of a Group that is a member of the AppRole.  A value of 'implicit' indicates that the AppRole is public.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The kind of membership this User has in the AppRole. A value of 'direct' indicates that the User is a member of the AppRole.  A value of  'indirect' indicates that the User is a member of a Group that is a member of the AppRole.  A value of 'implicit' indicates that the AppRole is public.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The ID of the App that defines this AppRole.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appId")
        private String appId;

        /**
         * The ID of the App that defines this AppRole.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param appId the value to set
         * @return this builder
         **/
        public Builder appId(String appId) {
            this.appId = appId;
            this.__explicitlySet__.add("appId");
            return this;
        }
        /**
         * The name (Client ID) of the App that defines this AppRole.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appName")
        private String appName;

        /**
         * The name (Client ID) of the App that defines this AppRole.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param appName the value to set
         * @return this builder
         **/
        public Builder appName(String appName) {
            this.appName = appName;
            this.__explicitlySet__.add("appName");
            return this;
        }
        /**
         * If true, then the role provides administrative access privileges. READ-ONLY.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminRole")
        private Boolean adminRole;

        /**
         * If true, then the role provides administrative access privileges. READ-ONLY.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param adminRole the value to set
         * @return this builder
         **/
        public Builder adminRole(Boolean adminRole) {
            this.adminRole = adminRole;
            this.__explicitlySet__.add("adminRole");
            return this;
        }
        /**
         * The name (if any) under which this AppRole should appear in this User's group-memberships for reasons of backward compatibility. Oracle Identity Cloud Service distinguishes between Groups and AppRoles, but some services still expect AppRoles appear as if they were service-instance-specific Groups.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("legacyGroupName")
        private String legacyGroupName;

        /**
         * The name (if any) under which this AppRole should appear in this User's group-memberships for reasons of backward compatibility. Oracle Identity Cloud Service distinguishes between Groups and AppRoles, but some services still expect AppRoles appear as if they were service-instance-specific Groups.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param legacyGroupName the value to set
         * @return this builder
         **/
        public Builder legacyGroupName(String legacyGroupName) {
            this.legacyGroupName = legacyGroupName;
            this.__explicitlySet__.add("legacyGroupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtAppRoles build() {
            UserExtAppRoles model =
                    new UserExtAppRoles(
                            this.value,
                            this.ref,
                            this.display,
                            this.type,
                            this.appId,
                            this.appName,
                            this.adminRole,
                            this.legacyGroupName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtAppRoles model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("appId")) {
                this.appId(model.getAppId());
            }
            if (model.wasPropertyExplicitlySet("appName")) {
                this.appName(model.getAppName());
            }
            if (model.wasPropertyExplicitlySet("adminRole")) {
                this.adminRole(model.getAdminRole());
            }
            if (model.wasPropertyExplicitlySet("legacyGroupName")) {
                this.legacyGroupName(model.getLegacyGroupName());
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
     * The Id of the AppRole assigned to the User.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The Id of the AppRole assigned to the User.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * The URI of the AppRole assigned to the User.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * The URI of the AppRole assigned to the User.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     * @return the value
     **/
    public String getRef() {
        return ref;
    }

    /**
     * The display name of the AppRole assigned to the User.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * The display name of the AppRole assigned to the User.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDisplay() {
        return display;
    }

    /**
     * The kind of membership this User has in the AppRole. A value of 'direct' indicates that the User is a member of the AppRole.  A value of  'indirect' indicates that the User is a member of a Group that is a member of the AppRole.  A value of 'implicit' indicates that the AppRole is public.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Type {
        Direct("direct"),
        Indirect("indirect"),
        Implicit("implicit"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The kind of membership this User has in the AppRole. A value of 'direct' indicates that the User is a member of the AppRole.  A value of  'indirect' indicates that the User is a member of a Group that is a member of the AppRole.  A value of 'implicit' indicates that the AppRole is public.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The kind of membership this User has in the AppRole. A value of 'direct' indicates that the User is a member of the AppRole.  A value of  'indirect' indicates that the User is a member of a Group that is a member of the AppRole.  A value of 'implicit' indicates that the AppRole is public.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The ID of the App that defines this AppRole.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appId")
    private final String appId;

    /**
     * The ID of the App that defines this AppRole.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAppId() {
        return appId;
    }

    /**
     * The name (Client ID) of the App that defines this AppRole.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appName")
    private final String appName;

    /**
     * The name (Client ID) of the App that defines this AppRole.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAppName() {
        return appName;
    }

    /**
     * If true, then the role provides administrative access privileges. READ-ONLY.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminRole")
    private final Boolean adminRole;

    /**
     * If true, then the role provides administrative access privileges. READ-ONLY.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getAdminRole() {
        return adminRole;
    }

    /**
     * The name (if any) under which this AppRole should appear in this User's group-memberships for reasons of backward compatibility. Oracle Identity Cloud Service distinguishes between Groups and AppRoles, but some services still expect AppRoles appear as if they were service-instance-specific Groups.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("legacyGroupName")
    private final String legacyGroupName;

    /**
     * The name (if any) under which this AppRole should appear in this User's group-memberships for reasons of backward compatibility. Oracle Identity Cloud Service distinguishes between Groups and AppRoles, but some services still expect AppRoles appear as if they were service-instance-specific Groups.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getLegacyGroupName() {
        return legacyGroupName;
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
        sb.append("UserExtAppRoles(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", appId=").append(String.valueOf(this.appId));
        sb.append(", appName=").append(String.valueOf(this.appName));
        sb.append(", adminRole=").append(String.valueOf(this.adminRole));
        sb.append(", legacyGroupName=").append(String.valueOf(this.legacyGroupName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtAppRoles)) {
            return false;
        }

        UserExtAppRoles other = (UserExtAppRoles) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.appId, other.appId)
                && java.util.Objects.equals(this.appName, other.appName)
                && java.util.Objects.equals(this.adminRole, other.adminRole)
                && java.util.Objects.equals(this.legacyGroupName, other.legacyGroupName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.appId == null ? 43 : this.appId.hashCode());
        result = (result * PRIME) + (this.appName == null ? 43 : this.appName.hashCode());
        result = (result * PRIME) + (this.adminRole == null ? 43 : this.adminRole.hashCode());
        result =
                (result * PRIME)
                        + (this.legacyGroupName == null ? 43 : this.legacyGroupName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
