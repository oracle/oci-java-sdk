/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The group members. <b>Important:</b> When requesting group members, a maximum of 10,000 members
 * can be returned in a single request. If the response contains more than 10,000 members, the
 * request will fail. Use 'startIndex' and 'count' to return members in pages instead of in a single
 * response, for example: #attributes=members[startIndex=1%26count=10]. This REST API is SCIM
 * compliant. <br>
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
        builder = MyRequestableGroupMembers.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MyRequestableGroupMembers
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "value",
        "dateAdded",
        "ocid",
        "membershipOcid",
        "ref",
        "display",
        "type",
        "name"
    })
    public MyRequestableGroupMembers(
            String value,
            String dateAdded,
            String ocid,
            String membershipOcid,
            String ref,
            String display,
            Type type,
            String name) {
        super();
        this.value = value;
        this.dateAdded = dateAdded;
        this.ocid = ocid;
        this.membershipOcid = membershipOcid;
        this.ref = ref;
        this.display = display;
        this.type = type;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of the member of this Group
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The ID of the member of this Group
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
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
         * The date and time that the member was added to the group.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * returned: default - type: dateTime - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dateAdded")
        private String dateAdded;

        /**
         * The date and time that the member was added to the group.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * returned: default - type: dateTime - uniqueness: none
         *
         * @param dateAdded the value to set
         * @return this builder
         */
        public Builder dateAdded(String dateAdded) {
            this.dateAdded = dateAdded;
            this.__explicitlySet__.add("dateAdded");
            return this;
        }
        /**
         * The OCID of the member of this group.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocid")
        private String ocid;

        /**
         * The OCID of the member of this group.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: always - type: string - uniqueness:
         * none
         *
         * @param ocid the value to set
         * @return this builder
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            this.__explicitlySet__.add("ocid");
            return this;
        }
        /**
         * The membership OCID.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("membershipOcid")
        private String membershipOcid;

        /**
         * The membership OCID.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param membershipOcid the value to set
         * @return this builder
         */
        public Builder membershipOcid(String membershipOcid) {
            this.membershipOcid = membershipOcid;
            this.__explicitlySet__.add("membershipOcid");
            return this;
        }
        /**
         * The URI that corresponds to the member Resource of this group.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: reference -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * The URI that corresponds to the member Resource of this group.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: reference -
         * uniqueness: none
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
         * The member's display name.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * The member's display name.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param display the value to set
         * @return this builder
         */
        public Builder display(String display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }
        /**
         * Indicates the type of resource, for example, User or Group.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - idcsDefaultValue:
         * User - multiValued: false - mutability: readWrite - required: true - returned: default -
         * type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Indicates the type of resource, for example, User or Group.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - idcsDefaultValue:
         * User - multiValued: false - mutability: readWrite - required: true - returned: default -
         * type: string - uniqueness: none
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The member's name.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The member's name.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyRequestableGroupMembers build() {
            MyRequestableGroupMembers model =
                    new MyRequestableGroupMembers(
                            this.value,
                            this.dateAdded,
                            this.ocid,
                            this.membershipOcid,
                            this.ref,
                            this.display,
                            this.type,
                            this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyRequestableGroupMembers model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("dateAdded")) {
                this.dateAdded(model.getDateAdded());
            }
            if (model.wasPropertyExplicitlySet("ocid")) {
                this.ocid(model.getOcid());
            }
            if (model.wasPropertyExplicitlySet("membershipOcid")) {
                this.membershipOcid(model.getMembershipOcid());
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
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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
     * The ID of the member of this Group
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The ID of the member of this Group
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The date and time that the member was added to the group.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * returned: default - type: dateTime - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateAdded")
    private final String dateAdded;

    /**
     * The date and time that the member was added to the group.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * returned: default - type: dateTime - uniqueness: none
     *
     * @return the value
     */
    public String getDateAdded() {
        return dateAdded;
    }

    /**
     * The OCID of the member of this group.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocid")
    private final String ocid;

    /**
     * The OCID of the member of this group.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getOcid() {
        return ocid;
    }

    /**
     * The membership OCID.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("membershipOcid")
    private final String membershipOcid;

    /**
     * The membership OCID.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMembershipOcid() {
        return membershipOcid;
    }

    /**
     * The URI that corresponds to the member Resource of this group.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: reference - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * The URI that corresponds to the member Resource of this group.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: reference - uniqueness:
     * none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * The member's display name.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * The member's display name.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Indicates the type of resource, for example, User or Group.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - idcsDefaultValue: User -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        User("User"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * Indicates the type of resource, for example, User or Group.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - idcsDefaultValue: User -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Indicates the type of resource, for example, User or Group.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - idcsDefaultValue: User -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The member's name.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The member's name.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getName() {
        return name;
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
        sb.append("MyRequestableGroupMembers(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", dateAdded=").append(String.valueOf(this.dateAdded));
        sb.append(", ocid=").append(String.valueOf(this.ocid));
        sb.append(", membershipOcid=").append(String.valueOf(this.membershipOcid));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyRequestableGroupMembers)) {
            return false;
        }

        MyRequestableGroupMembers other = (MyRequestableGroupMembers) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.dateAdded, other.dateAdded)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.membershipOcid, other.membershipOcid)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.dateAdded == null ? 43 : this.dateAdded.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result =
                (result * PRIME)
                        + (this.membershipOcid == null ? 43 : this.membershipOcid.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
