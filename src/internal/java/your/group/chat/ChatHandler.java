package your.group.chat;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.flintmc.framework.eventbus.event.subscribe.PostSubscribe;
import net.flintmc.framework.inject.logging.InjectLogger;
import net.flintmc.mcapi.chat.event.ChatSendEvent;
import net.flintmc.util.taskexecutor.TaskExecutor;
import org.apache.logging.log4j.Logger;

@Singleton
public class ChatHandler {

  private final Logger logger;
  private final TaskExecutor executor;

  @Inject
  private ChatHandler(@InjectLogger Logger logger, TaskExecutor executor) {
    this.logger = logger;
    this.executor = executor;
  }

  @PostSubscribe
  public void onChat(ChatSendEvent event, ChatConfig config) {
    if (event.getMessage().equals("Remind me!")) {
      this.executor.scheduleSync(60 * 20, () -> this.logger.info(config.getReminderMessage()));
    }
  }
}