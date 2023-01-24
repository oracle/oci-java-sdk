/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Mask PII entities with the given masking character.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PiiEntityMask.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "mode"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PiiEntityMask extends PiiEntityMasking {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Masking character. By default, the character is an asterisk (*)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingCharacter")
        private String maskingCharacter;

        /**
         * Masking character. By default, the character is an asterisk (*)
         * @param maskingCharacter the value to set
         * @return this builder
         **/
        public Builder maskingCharacter(String maskingCharacter) {
            this.maskingCharacter = maskingCharacter;
            this.__explicitlySet__.add("maskingCharacter");
            return this;
        }
        /**
         * Number of characters to leave unmasked. By default, the whole entity is masked.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("leaveCharactersUnmasked")
        private Integer leaveCharactersUnmasked;

        /**
         * Number of characters to leave unmasked. By default, the whole entity is masked.
         * @param leaveCharactersUnmasked the value to set
         * @return this builder
         **/
        public Builder leaveCharactersUnmasked(Integer leaveCharactersUnmasked) {
            this.leaveCharactersUnmasked = leaveCharactersUnmasked;
            this.__explicitlySet__.add("leaveCharactersUnmasked");
            return this;
        }
        /**
         * Unmask from the end. By default, the whole entity is masked. This field works in concert with
         * leaveCharactersUnmasked. For example, leaveCharactersUnmasked is 3 and isUnmaskedFromEnd is true,
         * then if the entity is India the masked entity/result is **dia.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUnmaskedFromEnd")
        private Boolean isUnmaskedFromEnd;

        /**
         * Unmask from the end. By default, the whole entity is masked. This field works in concert with
         * leaveCharactersUnmasked. For example, leaveCharactersUnmasked is 3 and isUnmaskedFromEnd is true,
         * then if the entity is India the masked entity/result is **dia.
         *
         * @param isUnmaskedFromEnd the value to set
         * @return this builder
         **/
        public Builder isUnmaskedFromEnd(Boolean isUnmaskedFromEnd) {
            this.isUnmaskedFromEnd = isUnmaskedFromEnd;
            this.__explicitlySet__.add("isUnmaskedFromEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PiiEntityMask build() {
            PiiEntityMask model =
                    new PiiEntityMask(
                            this.maskingCharacter,
                            this.leaveCharactersUnmasked,
                            this.isUnmaskedFromEnd);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PiiEntityMask model) {
            if (model.wasPropertyExplicitlySet("maskingCharacter")) {
                this.maskingCharacter(model.getMaskingCharacter());
            }
            if (model.wasPropertyExplicitlySet("leaveCharactersUnmasked")) {
                this.leaveCharactersUnmasked(model.getLeaveCharactersUnmasked());
            }
            if (model.wasPropertyExplicitlySet("isUnmaskedFromEnd")) {
                this.isUnmaskedFromEnd(model.getIsUnmaskedFromEnd());
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

    @Deprecated
    public PiiEntityMask(
            String maskingCharacter, Integer leaveCharactersUnmasked, Boolean isUnmaskedFromEnd) {
        super();
        this.maskingCharacter = maskingCharacter;
        this.leaveCharactersUnmasked = leaveCharactersUnmasked;
        this.isUnmaskedFromEnd = isUnmaskedFromEnd;
    }

    /**
     * Masking character. By default, the character is an asterisk (*)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingCharacter")
    private final String maskingCharacter;

    /**
     * Masking character. By default, the character is an asterisk (*)
     * @return the value
     **/
    public String getMaskingCharacter() {
        return maskingCharacter;
    }

    /**
     * Number of characters to leave unmasked. By default, the whole entity is masked.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("leaveCharactersUnmasked")
    private final Integer leaveCharactersUnmasked;

    /**
     * Number of characters to leave unmasked. By default, the whole entity is masked.
     * @return the value
     **/
    public Integer getLeaveCharactersUnmasked() {
        return leaveCharactersUnmasked;
    }

    /**
     * Unmask from the end. By default, the whole entity is masked. This field works in concert with
     * leaveCharactersUnmasked. For example, leaveCharactersUnmasked is 3 and isUnmaskedFromEnd is true,
     * then if the entity is India the masked entity/result is **dia.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnmaskedFromEnd")
    private final Boolean isUnmaskedFromEnd;

    /**
     * Unmask from the end. By default, the whole entity is masked. This field works in concert with
     * leaveCharactersUnmasked. For example, leaveCharactersUnmasked is 3 and isUnmaskedFromEnd is true,
     * then if the entity is India the masked entity/result is **dia.
     *
     * @return the value
     **/
    public Boolean getIsUnmaskedFromEnd() {
        return isUnmaskedFromEnd;
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
        sb.append("PiiEntityMask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", maskingCharacter=").append(String.valueOf(this.maskingCharacter));
        sb.append(", leaveCharactersUnmasked=")
                .append(String.valueOf(this.leaveCharactersUnmasked));
        sb.append(", isUnmaskedFromEnd=").append(String.valueOf(this.isUnmaskedFromEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PiiEntityMask)) {
            return false;
        }

        PiiEntityMask other = (PiiEntityMask) o;
        return java.util.Objects.equals(this.maskingCharacter, other.maskingCharacter)
                && java.util.Objects.equals(
                        this.leaveCharactersUnmasked, other.leaveCharactersUnmasked)
                && java.util.Objects.equals(this.isUnmaskedFromEnd, other.isUnmaskedFromEnd)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maskingCharacter == null ? 43 : this.maskingCharacter.hashCode());
        result =
                (result * PRIME)
                        + (this.leaveCharactersUnmasked == null
                                ? 43
                                : this.leaveCharactersUnmasked.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnmaskedFromEnd == null ? 43 : this.isUnmaskedFromEnd.hashCode());
        return result;
    }
}
