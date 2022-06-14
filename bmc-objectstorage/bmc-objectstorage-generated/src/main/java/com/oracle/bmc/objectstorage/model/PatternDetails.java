/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Specifying inclusion and exclusion patterns.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatternDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatternDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"inclusionPatterns", "exclusionPatterns"})
    public PatternDetails(
            java.util.List<String> inclusionPatterns, java.util.List<String> exclusionPatterns) {
        super();
        this.inclusionPatterns = inclusionPatterns;
        this.exclusionPatterns = exclusionPatterns;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of glob patterns to match the object names to include. An empty array includes all objects in the
         * bucket. Exclusion patterns take precedence over inclusion patterns.
         * A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other
         * than the special pattern characters described below, matches itself.
         *     Glob patterns must be between 1 and 1024 characters.
         * <p>
         * The special pattern characters have the following meanings:
         * <p>
         * \\           Escapes the following character
         *     *           Matches any string of characters.
         *     ?           Matches any single character .
         *     [...]       Matches a group of characters. A group of characters can be:
         *                     A set of characters, for example: [Zafg9@]. This matches any character in the brackets.
         *                     A range of characters, for example: [a-z]. This matches any character in the range.
         *                         [a-f] is equivalent to [abcdef].
         *                         For character ranges only the CHARACTER-CHARACTER pattern is supported.
         *                             [ab-yz] is not valid
         *                             [a-mn-z] is not valid
         *                         Character ranges can not start with ^ or :
         *                         To include a '-' in the range, make it the first or last character.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inclusionPatterns")
        private java.util.List<String> inclusionPatterns;

        /**
         * An array of glob patterns to match the object names to include. An empty array includes all objects in the
         * bucket. Exclusion patterns take precedence over inclusion patterns.
         * A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other
         * than the special pattern characters described below, matches itself.
         *     Glob patterns must be between 1 and 1024 characters.
         * <p>
         * The special pattern characters have the following meanings:
         * <p>
         * \\           Escapes the following character
         *     *           Matches any string of characters.
         *     ?           Matches any single character .
         *     [...]       Matches a group of characters. A group of characters can be:
         *                     A set of characters, for example: [Zafg9@]. This matches any character in the brackets.
         *                     A range of characters, for example: [a-z]. This matches any character in the range.
         *                         [a-f] is equivalent to [abcdef].
         *                         For character ranges only the CHARACTER-CHARACTER pattern is supported.
         *                             [ab-yz] is not valid
         *                             [a-mn-z] is not valid
         *                         Character ranges can not start with ^ or :
         *                         To include a '-' in the range, make it the first or last character.
         *
         * @param inclusionPatterns the value to set
         * @return this builder
         **/
        public Builder inclusionPatterns(java.util.List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            this.__explicitlySet__.add("inclusionPatterns");
            return this;
        }
        /**
         * An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion
         * patterns take precedence over inclusion patterns.
         * A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other
         * than the special pattern characters described below, matches itself.
         *     Glob patterns must be between 1 and 1024 characters.
         * <p>
         * The special pattern characters have the following meanings:
         * <p>
         * \\           Escapes the following character
         *     *           Matches any string of characters.
         *     ?           Matches any single character .
         *     [...]       Matches a group of characters. A group of characters can be:
         *                     A set of characters, for example: [Zafg9@]. This matches any character in the brackets.
         *                     A range of characters, for example: [a-z]. This matches any character in the range.
         *                         [a-f] is equivalent to [abcdef].
         *                         For character ranges only the CHARACTER-CHARACTER pattern is supported.
         *                             [ab-yz] is not valid
         *                             [a-mn-z] is not valid
         *                         Character ranges can not start with ^ or :
         *                         To include a '-' in the range, make it the first or last character.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exclusionPatterns")
        private java.util.List<String> exclusionPatterns;

        /**
         * An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion
         * patterns take precedence over inclusion patterns.
         * A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other
         * than the special pattern characters described below, matches itself.
         *     Glob patterns must be between 1 and 1024 characters.
         * <p>
         * The special pattern characters have the following meanings:
         * <p>
         * \\           Escapes the following character
         *     *           Matches any string of characters.
         *     ?           Matches any single character .
         *     [...]       Matches a group of characters. A group of characters can be:
         *                     A set of characters, for example: [Zafg9@]. This matches any character in the brackets.
         *                     A range of characters, for example: [a-z]. This matches any character in the range.
         *                         [a-f] is equivalent to [abcdef].
         *                         For character ranges only the CHARACTER-CHARACTER pattern is supported.
         *                             [ab-yz] is not valid
         *                             [a-mn-z] is not valid
         *                         Character ranges can not start with ^ or :
         *                         To include a '-' in the range, make it the first or last character.
         *
         * @param exclusionPatterns the value to set
         * @return this builder
         **/
        public Builder exclusionPatterns(java.util.List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            this.__explicitlySet__.add("exclusionPatterns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatternDetails build() {
            PatternDetails __instance__ = new PatternDetails(inclusionPatterns, exclusionPatterns);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatternDetails o) {
            Builder copiedBuilder =
                    inclusionPatterns(o.getInclusionPatterns())
                            .exclusionPatterns(o.getExclusionPatterns());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * An array of glob patterns to match the object names to include. An empty array includes all objects in the
     * bucket. Exclusion patterns take precedence over inclusion patterns.
     * A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other
     * than the special pattern characters described below, matches itself.
     *     Glob patterns must be between 1 and 1024 characters.
     * <p>
     * The special pattern characters have the following meanings:
     * <p>
     * \\           Escapes the following character
     *     *           Matches any string of characters.
     *     ?           Matches any single character .
     *     [...]       Matches a group of characters. A group of characters can be:
     *                     A set of characters, for example: [Zafg9@]. This matches any character in the brackets.
     *                     A range of characters, for example: [a-z]. This matches any character in the range.
     *                         [a-f] is equivalent to [abcdef].
     *                         For character ranges only the CHARACTER-CHARACTER pattern is supported.
     *                             [ab-yz] is not valid
     *                             [a-mn-z] is not valid
     *                         Character ranges can not start with ^ or :
     *                         To include a '-' in the range, make it the first or last character.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inclusionPatterns")
    private final java.util.List<String> inclusionPatterns;

    /**
     * An array of glob patterns to match the object names to include. An empty array includes all objects in the
     * bucket. Exclusion patterns take precedence over inclusion patterns.
     * A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other
     * than the special pattern characters described below, matches itself.
     *     Glob patterns must be between 1 and 1024 characters.
     * <p>
     * The special pattern characters have the following meanings:
     * <p>
     * \\           Escapes the following character
     *     *           Matches any string of characters.
     *     ?           Matches any single character .
     *     [...]       Matches a group of characters. A group of characters can be:
     *                     A set of characters, for example: [Zafg9@]. This matches any character in the brackets.
     *                     A range of characters, for example: [a-z]. This matches any character in the range.
     *                         [a-f] is equivalent to [abcdef].
     *                         For character ranges only the CHARACTER-CHARACTER pattern is supported.
     *                             [ab-yz] is not valid
     *                             [a-mn-z] is not valid
     *                         Character ranges can not start with ^ or :
     *                         To include a '-' in the range, make it the first or last character.
     *
     * @return the value
     **/
    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion
     * patterns take precedence over inclusion patterns.
     * A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other
     * than the special pattern characters described below, matches itself.
     *     Glob patterns must be between 1 and 1024 characters.
     * <p>
     * The special pattern characters have the following meanings:
     * <p>
     * \\           Escapes the following character
     *     *           Matches any string of characters.
     *     ?           Matches any single character .
     *     [...]       Matches a group of characters. A group of characters can be:
     *                     A set of characters, for example: [Zafg9@]. This matches any character in the brackets.
     *                     A range of characters, for example: [a-z]. This matches any character in the range.
     *                         [a-f] is equivalent to [abcdef].
     *                         For character ranges only the CHARACTER-CHARACTER pattern is supported.
     *                             [ab-yz] is not valid
     *                             [a-mn-z] is not valid
     *                         Character ranges can not start with ^ or :
     *                         To include a '-' in the range, make it the first or last character.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exclusionPatterns")
    private final java.util.List<String> exclusionPatterns;

    /**
     * An array of glob patterns to match the object names to exclude. An empty array is ignored. Exclusion
     * patterns take precedence over inclusion patterns.
     * A Glob pattern is a sequence of characters to match text. Any character that appears in the pattern, other
     * than the special pattern characters described below, matches itself.
     *     Glob patterns must be between 1 and 1024 characters.
     * <p>
     * The special pattern characters have the following meanings:
     * <p>
     * \\           Escapes the following character
     *     *           Matches any string of characters.
     *     ?           Matches any single character .
     *     [...]       Matches a group of characters. A group of characters can be:
     *                     A set of characters, for example: [Zafg9@]. This matches any character in the brackets.
     *                     A range of characters, for example: [a-z]. This matches any character in the range.
     *                         [a-f] is equivalent to [abcdef].
     *                         For character ranges only the CHARACTER-CHARACTER pattern is supported.
     *                             [ab-yz] is not valid
     *                             [a-mn-z] is not valid
     *                         Character ranges can not start with ^ or :
     *                         To include a '-' in the range, make it the first or last character.
     *
     * @return the value
     **/
    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PatternDetails(");
        sb.append("inclusionPatterns=").append(String.valueOf(this.inclusionPatterns));
        sb.append(", exclusionPatterns=").append(String.valueOf(this.exclusionPatterns));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatternDetails)) {
            return false;
        }

        PatternDetails other = (PatternDetails) o;
        return java.util.Objects.equals(this.inclusionPatterns, other.inclusionPatterns)
                && java.util.Objects.equals(this.exclusionPatterns, other.exclusionPatterns)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inclusionPatterns == null ? 43 : this.inclusionPatterns.hashCode());
        result =
                (result * PRIME)
                        + (this.exclusionPatterns == null ? 43 : this.exclusionPatterns.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
