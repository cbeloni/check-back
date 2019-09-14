alter table meme drop column fake;
update meme set is_fake = true;
commit;