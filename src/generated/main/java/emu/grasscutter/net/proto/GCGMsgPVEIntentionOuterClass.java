// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgPVEIntention.proto

package emu.grasscutter.net.proto;

public final class GCGMsgPVEIntentionOuterClass {
  private GCGMsgPVEIntentionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgPVEIntentionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgPVEIntention)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_guid = 9;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>repeated uint32 skill_id_list = 3;</code>
     * @return A list containing the skillIdList.
     */
    java.util.List<java.lang.Integer> getSkillIdListList();
    /**
     * <code>repeated uint32 skill_id_list = 3;</code>
     * @return The count of skillIdList.
     */
    int getSkillIdListCount();
    /**
     * <code>repeated uint32 skill_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The skillIdList at the given index.
     */
    int getSkillIdList(int index);
  }
  /**
   * <pre>
   * Obf: ADPMJBODPGK
   * </pre>
   *
   * Protobuf type {@code GCGMsgPVEIntention}
   */
  public static final class GCGMsgPVEIntention extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgPVEIntention)
      GCGMsgPVEIntentionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgPVEIntention.newBuilder() to construct.
    private GCGMsgPVEIntention(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgPVEIntention() {
      skillIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgPVEIntention();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgPVEIntention(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                skillIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              skillIdList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                skillIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                skillIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {

              cardGuid_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          skillIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.internal_static_GCGMsgPVEIntention_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.internal_static_GCGMsgPVEIntention_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention.class, emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention.Builder.class);
    }

    public static final int CARD_GUID_FIELD_NUMBER = 9;
    private int cardGuid_;
    /**
     * <code>uint32 card_guid = 9;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int SKILL_ID_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList skillIdList_;
    /**
     * <code>repeated uint32 skill_id_list = 3;</code>
     * @return A list containing the skillIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSkillIdListList() {
      return skillIdList_;
    }
    /**
     * <code>repeated uint32 skill_id_list = 3;</code>
     * @return The count of skillIdList.
     */
    public int getSkillIdListCount() {
      return skillIdList_.size();
    }
    /**
     * <code>repeated uint32 skill_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The skillIdList at the given index.
     */
    public int getSkillIdList(int index) {
      return skillIdList_.getInt(index);
    }
    private int skillIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getSkillIdListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(skillIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < skillIdList_.size(); i++) {
        output.writeUInt32NoTag(skillIdList_.getInt(i));
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(9, cardGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < skillIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(skillIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSkillIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        skillIdListMemoizedSerializedSize = dataSize;
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, cardGuid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention other = (emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention) obj;

      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (!getSkillIdListList()
          .equals(other.getSkillIdListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      if (getSkillIdListCount() > 0) {
        hash = (37 * hash) + SKILL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: ADPMJBODPGK
     * </pre>
     *
     * Protobuf type {@code GCGMsgPVEIntention}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgPVEIntention)
        emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntentionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.internal_static_GCGMsgPVEIntention_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.internal_static_GCGMsgPVEIntention_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention.class, emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cardGuid_ = 0;

        skillIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.internal_static_GCGMsgPVEIntention_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention build() {
        emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention buildPartial() {
        emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention result = new emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention(this);
        int from_bitField0_ = bitField0_;
        result.cardGuid_ = cardGuid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          skillIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skillIdList_ = skillIdList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention other) {
        if (other == emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention.getDefaultInstance()) return this;
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (!other.skillIdList_.isEmpty()) {
          if (skillIdList_.isEmpty()) {
            skillIdList_ = other.skillIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkillIdListIsMutable();
            skillIdList_.addAll(other.skillIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 9;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 9;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList skillIdList_ = emptyIntList();
      private void ensureSkillIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          skillIdList_ = mutableCopy(skillIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 skill_id_list = 3;</code>
       * @return A list containing the skillIdList.
       */
      public java.util.List<java.lang.Integer>
          getSkillIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(skillIdList_) : skillIdList_;
      }
      /**
       * <code>repeated uint32 skill_id_list = 3;</code>
       * @return The count of skillIdList.
       */
      public int getSkillIdListCount() {
        return skillIdList_.size();
      }
      /**
       * <code>repeated uint32 skill_id_list = 3;</code>
       * @param index The index of the element to return.
       * @return The skillIdList at the given index.
       */
      public int getSkillIdList(int index) {
        return skillIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 skill_id_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The skillIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSkillIdList(
          int index, int value) {
        ensureSkillIdListIsMutable();
        skillIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 3;</code>
       * @param value The skillIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSkillIdList(int value) {
        ensureSkillIdListIsMutable();
        skillIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 3;</code>
       * @param values The skillIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSkillIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSkillIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillIdList() {
        skillIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GCGMsgPVEIntention)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgPVEIntention)
    private static final emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention();
    }

    public static emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgPVEIntention>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgPVEIntention>() {
      @java.lang.Override
      public GCGMsgPVEIntention parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgPVEIntention(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgPVEIntention> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgPVEIntention> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgPVEIntention_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgPVEIntention_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGMsgPVEIntention.proto\">\n\022GCGMsgPVEI" +
      "ntention\022\021\n\tcard_guid\030\t \001(\r\022\025\n\rskill_id_" +
      "list\030\003 \003(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGMsgPVEIntention_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgPVEIntention_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgPVEIntention_descriptor,
        new java.lang.String[] { "CardGuid", "SkillIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
