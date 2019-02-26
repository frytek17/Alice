package it.efekt.alice.commands.fun.nsfw;

import it.efekt.alice.commands.core.Command;
import it.efekt.alice.commands.core.CommandCategory;
import it.efekt.alice.core.AliceBootstrap;
import it.efekt.alice.lang.Message;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import pw.aru.api.nekos4j.Nekos4J;
import pw.aru.api.nekos4j.image.Image;
import pw.aru.api.nekos4j.image.ImageProvider;

public class NekoCmd extends Command {
    private Nekos4J api = new Nekos4J.Builder().build();
    private ImageProvider imageProvider = api.getImageProvider();

    public NekoCmd(String alias) {
        super(alias);
        setDescription(Message.CMD_NEKO_DESC);
        setCategory(CommandCategory.FUN);
    }

    @Override
    public boolean onCommand(MessageReceivedEvent e) {
        Image image = imageProvider.getRandomImage("neko").execute();
            String imageUrl = image.getUrl();
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setImage(imageUrl);
            embedBuilder.setColor(AliceBootstrap.EMBED_COLOR);
            e.getChannel().sendMessage(embedBuilder.build()).queue();
        return true;
    }
}
