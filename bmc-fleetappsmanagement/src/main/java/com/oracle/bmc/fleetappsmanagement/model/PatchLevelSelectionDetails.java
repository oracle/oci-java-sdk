/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Patch Level Details. If you set the policy rule by selecting this option and provide the Patch
 * level as Latest, Fleet Application Management calculates the compliance status of the product in
 * the following ways: - Reports the patch process as compliant for the software identified or
 * targets discovered at the Latest and Latest-1 version. - Reports the patch process as
 * noncompliant for the software identified or targets discovered at the Latest-2 version. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchLevelSelectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "selectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchLevelSelectionDetails extends PatchSelectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Patch Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchLevel")
        private PatchLevel patchLevel;

        /**
         * Patch Name.
         *
         * @param patchLevel the value to set
         * @return this builder
         */
        public Builder patchLevel(PatchLevel patchLevel) {
            this.patchLevel = patchLevel;
            this.__explicitlySet__.add("patchLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchLevelSelectionDetails build() {
            PatchLevelSelectionDetails model = new PatchLevelSelectionDetails(this.patchLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchLevelSelectionDetails model) {
            if (model.wasPropertyExplicitlySet("patchLevel")) {
                this.patchLevel(model.getPatchLevel());
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

    @Deprecated
    public PatchLevelSelectionDetails(PatchLevel patchLevel) {
        super();
        this.patchLevel = patchLevel;
    }

    /** Patch Name. */
    public enum PatchLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Latest("LATEST"),
        LatestMinusOne("LATEST_MINUS_ONE"),
        LatestMinusTwo("LATEST_MINUS_TWO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchLevel.class);

        private final String value;
        private static java.util.Map<String, PatchLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchLevel v : PatchLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Patch Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchLevel")
    private final PatchLevel patchLevel;

    /**
     * Patch Name.
     *
     * @return the value
     */
    public PatchLevel getPatchLevel() {
        return patchLevel;
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
        sb.append("PatchLevelSelectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", patchLevel=").append(String.valueOf(this.patchLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchLevelSelectionDetails)) {
            return false;
        }

        PatchLevelSelectionDetails other = (PatchLevelSelectionDetails) o;
        return java.util.Objects.equals(this.patchLevel, other.patchLevel) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.patchLevel == null ? 43 : this.patchLevel.hashCode());
        return result;
    }
}
