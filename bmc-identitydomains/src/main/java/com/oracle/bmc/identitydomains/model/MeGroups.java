/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of groups that the user belongs to, either thorough direct membership, nested groups, or
 * dynamically calculated <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MeGroups.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MeGroups extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "value",
        "ocid",
        "ref",
        "display",
        "nonUniqueDisplay",
        "externalId",
        "type",
        "membershipOcid",
        "dateAdded"
    })
    public MeGroups(
            String value,
            String ocid,
            String ref,
            String display,
            String nonUniqueDisplay,
            String externalId,
            Type type,
            String membershipOcid,
            String dateAdded) {
        super();
        this.value = value;
        this.ocid = ocid;
        this.ref = ref;
        this.display = display;
        this.nonUniqueDisplay = nonUniqueDisplay;
        this.externalId = externalId;
        this.type = type;
        this.membershipOcid = membershipOcid;
        this.dateAdded = dateAdded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier of the User's group.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The identifier of the User's group.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: always - type: string - uniqueness:
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
         * The OCID of the User's group.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocid")
        private String ocid;

        /**
         * The OCID of the User's group.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
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
         * The URI of the corresponding Group resource to which the user belongs
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * The URI of the corresponding Group resource to which the user belongs
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
         * A human readable name, primarily used for display purposes. READ-ONLY.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * A human readable name, primarily used for display purposes. READ-ONLY.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
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
         * A human readable name for Group as defined by the Service Consumer. READ-ONLY.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nonUniqueDisplay")
        private String nonUniqueDisplay;

        /**
         * A human readable name for Group as defined by the Service Consumer. READ-ONLY.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         *
         * @param nonUniqueDisplay the value to set
         * @return this builder
         */
        public Builder nonUniqueDisplay(String nonUniqueDisplay) {
            this.nonUniqueDisplay = nonUniqueDisplay;
            this.__explicitlySet__.add("nonUniqueDisplay");
            return this;
        }
        /**
         * An identifier for the Resource as defined by the Service Consumer. READ-ONLY.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * An identifier for the Resource as defined by the Service Consumer. READ-ONLY.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         *
         * @param externalId the value to set
         * @return this builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }
        /**
         * A label indicating the attribute's function; e.g., 'direct' or 'indirect'.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * A label indicating the attribute's function; e.g., 'direct' or 'indirect'.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: string - uniqueness: none
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
         * The membership OCID.
         *
         * <p>*Added In:** 2103141444
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("membershipOcid")
        private String membershipOcid;

        /**
         * The membership OCID.
         *
         * <p>*Added In:** 2103141444
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
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
         * Date when the member is Added to the group
         *
         * <p>*Added In:** 2105200541
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: dateTime - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dateAdded")
        private String dateAdded;

        /**
         * Date when the member is Added to the group
         *
         * <p>*Added In:** 2105200541
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MeGroups build() {
            MeGroups model =
                    new MeGroups(
                            this.value,
                            this.ocid,
                            this.ref,
                            this.display,
                            this.nonUniqueDisplay,
                            this.externalId,
                            this.type,
                            this.membershipOcid,
                            this.dateAdded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MeGroups model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ocid")) {
                this.ocid(model.getOcid());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("nonUniqueDisplay")) {
                this.nonUniqueDisplay(model.getNonUniqueDisplay());
            }
            if (model.wasPropertyExplicitlySet("externalId")) {
                this.externalId(model.getExternalId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("membershipOcid")) {
                this.membershipOcid(model.getMembershipOcid());
            }
            if (model.wasPropertyExplicitlySet("dateAdded")) {
                this.dateAdded(model.getDateAdded());
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
     * The identifier of the User's group.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The identifier of the User's group.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The OCID of the User's group.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocid")
    private final String ocid;

    /**
     * The OCID of the User's group.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getOcid() {
        return ocid;
    }

    /**
     * The URI of the corresponding Group resource to which the user belongs
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * The URI of the corresponding Group resource to which the user belongs
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
     * A human readable name, primarily used for display purposes. READ-ONLY.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * A human readable name, primarily used for display purposes. READ-ONLY.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDisplay() {
        return display;
    }

    /**
     * A human readable name for Group as defined by the Service Consumer. READ-ONLY.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nonUniqueDisplay")
    private final String nonUniqueDisplay;

    /**
     * A human readable name for Group as defined by the Service Consumer. READ-ONLY.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getNonUniqueDisplay() {
        return nonUniqueDisplay;
    }

    /**
     * An identifier for the Resource as defined by the Service Consumer. READ-ONLY.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * An identifier for the Resource as defined by the Service Consumer. READ-ONLY.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * A label indicating the attribute's function; e.g., 'direct' or 'indirect'.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: request - type: string - uniqueness: none
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Direct("direct"),
        Indirect("indirect"),

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
     * A label indicating the attribute's function; e.g., 'direct' or 'indirect'.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * A label indicating the attribute's function; e.g., 'direct' or 'indirect'.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The membership OCID.
     *
     * <p>*Added In:** 2103141444
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("membershipOcid")
    private final String membershipOcid;

    /**
     * The membership OCID.
     *
     * <p>*Added In:** 2103141444
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMembershipOcid() {
        return membershipOcid;
    }

    /**
     * Date when the member is Added to the group
     *
     * <p>*Added In:** 2105200541
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: dateTime - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateAdded")
    private final String dateAdded;

    /**
     * Date when the member is Added to the group
     *
     * <p>*Added In:** 2105200541
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: dateTime - uniqueness: none
     *
     * @return the value
     */
    public String getDateAdded() {
        return dateAdded;
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
        sb.append("MeGroups(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ocid=").append(String.valueOf(this.ocid));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", nonUniqueDisplay=").append(String.valueOf(this.nonUniqueDisplay));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", membershipOcid=").append(String.valueOf(this.membershipOcid));
        sb.append(", dateAdded=").append(String.valueOf(this.dateAdded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MeGroups)) {
            return false;
        }

        MeGroups other = (MeGroups) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.nonUniqueDisplay, other.nonUniqueDisplay)
                && java.util.Objects.equals(this.externalId, other.externalId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.membershipOcid, other.membershipOcid)
                && java.util.Objects.equals(this.dateAdded, other.dateAdded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result =
                (result * PRIME)
                        + (this.nonUniqueDisplay == null ? 43 : this.nonUniqueDisplay.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.membershipOcid == null ? 43 : this.membershipOcid.hashCode());
        result = (result * PRIME) + (this.dateAdded == null ? 43 : this.dateAdded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
