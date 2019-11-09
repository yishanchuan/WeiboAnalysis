import logging
from logging.handlers import SMTPHandler

host="smtp.swu.edu.cn", 25
handler = SMTPHandler(host=host, fromaddr="yishanchuan@email.swu.edu.cn",toaddr="yishanchuan@outlook.com",subject="Service Warning!")

logger = logging.getLogger('theapp')
logger.setLevel(logging.INFO)
logger.addHandler(handler)

def email(func):
    def _email(*args, **kwargs):
        try: 
            return func(*args, **kwargs)
        except Exception:
            logger.exception('A problem has appeared!')
            raise
    return _email

@email.error
def function():
    print()