// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scheduler.proto

package bit.workflowScheduler.grpc.Scheduler.gencode;

public interface DeleteWorkflowReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bit.workflowScheduler.grpc.Scheduler.gencode.DeleteWorkflowReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 返回标记符，1表示成功删除，0表示失败
   * </pre>
   *
   * <code>uint32 result = 1;</code>
   */
  int getResult();

  /**
   * <pre>
   * 如果失败，填具体消息
   * </pre>
   *
   * <code>string error_message = 2;</code>
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * 如果失败，填具体消息
   * </pre>
   *
   * <code>string error_message = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
