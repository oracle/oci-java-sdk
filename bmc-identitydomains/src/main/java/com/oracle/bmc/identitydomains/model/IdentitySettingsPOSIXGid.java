/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of Posix Gid settings.
 *
 * <p>*Added In:** 17.4.6
 *
 * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - required: false - type:
 * complex - uniqueness: none <br>
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
        builder = IdentitySettingsPOSIXGid.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentitySettingsPOSIXGid
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"manualAssignmentStartsFrom", "manualAssignmentEndsAt"})
    public IdentitySettingsPOSIXGid(
            Integer manualAssignmentStartsFrom, Integer manualAssignmentEndsAt) {
        super();
        this.manualAssignmentStartsFrom = manualAssignmentStartsFrom;
        this.manualAssignmentEndsAt = manualAssignmentEndsAt;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number from which the Posix Gid Manual assignment starts.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("manualAssignmentStartsFrom")
        private Integer manualAssignmentStartsFrom;

        /**
         * The number from which the Posix Gid Manual assignment starts.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param manualAssignmentStartsFrom the value to set
         * @return this builder
         */
        public Builder manualAssignmentStartsFrom(Integer manualAssignmentStartsFrom) {
            this.manualAssignmentStartsFrom = manualAssignmentStartsFrom;
            this.__explicitlySet__.add("manualAssignmentStartsFrom");
            return this;
        }
        /**
         * The number at which the Posix Gid Manual assignment ends.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("manualAssignmentEndsAt")
        private Integer manualAssignmentEndsAt;

        /**
         * The number at which the Posix Gid Manual assignment ends.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param manualAssignmentEndsAt the value to set
         * @return this builder
         */
        public Builder manualAssignmentEndsAt(Integer manualAssignmentEndsAt) {
            this.manualAssignmentEndsAt = manualAssignmentEndsAt;
            this.__explicitlySet__.add("manualAssignmentEndsAt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentitySettingsPOSIXGid build() {
            IdentitySettingsPOSIXGid model =
                    new IdentitySettingsPOSIXGid(
                            this.manualAssignmentStartsFrom, this.manualAssignmentEndsAt);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentitySettingsPOSIXGid model) {
            if (model.wasPropertyExplicitlySet("manualAssignmentStartsFrom")) {
                this.manualAssignmentStartsFrom(model.getManualAssignmentStartsFrom());
            }
            if (model.wasPropertyExplicitlySet("manualAssignmentEndsAt")) {
                this.manualAssignmentEndsAt(model.getManualAssignmentEndsAt());
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
     * The number from which the Posix Gid Manual assignment starts.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manualAssignmentStartsFrom")
    private final Integer manualAssignmentStartsFrom;

    /**
     * The number from which the Posix Gid Manual assignment starts.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getManualAssignmentStartsFrom() {
        return manualAssignmentStartsFrom;
    }

    /**
     * The number at which the Posix Gid Manual assignment ends.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manualAssignmentEndsAt")
    private final Integer manualAssignmentEndsAt;

    /**
     * The number at which the Posix Gid Manual assignment ends.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getManualAssignmentEndsAt() {
        return manualAssignmentEndsAt;
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
        sb.append("IdentitySettingsPOSIXGid(");
        sb.append("super=").append(super.toString());
        sb.append("manualAssignmentStartsFrom=")
                .append(String.valueOf(this.manualAssignmentStartsFrom));
        sb.append(", manualAssignmentEndsAt=").append(String.valueOf(this.manualAssignmentEndsAt));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentitySettingsPOSIXGid)) {
            return false;
        }

        IdentitySettingsPOSIXGid other = (IdentitySettingsPOSIXGid) o;
        return java.util.Objects.equals(
                        this.manualAssignmentStartsFrom, other.manualAssignmentStartsFrom)
                && java.util.Objects.equals(
                        this.manualAssignmentEndsAt, other.manualAssignmentEndsAt)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.manualAssignmentStartsFrom == null
                                ? 43
                                : this.manualAssignmentStartsFrom.hashCode());
        result =
                (result * PRIME)
                        + (this.manualAssignmentEndsAt == null
                                ? 43
                                : this.manualAssignmentEndsAt.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
