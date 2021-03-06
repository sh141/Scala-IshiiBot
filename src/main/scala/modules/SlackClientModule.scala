package modules

import com.google.inject.AbstractModule
import infra.SlackClient
import infra.implement.{SlackClientImpl, SlackClientLocalMock}

class SlackClientModule extends AbstractModule {
  override def configure(): Unit =
      bind(classOf[SlackClient]).to(classOf[SlackClientImpl])
//    bind(classOf[SlackClient]).to(classOf[SlackClientLocalMock])
}
